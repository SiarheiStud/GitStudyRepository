package Modul1.linearProgramm;

import java.text.DecimalFormat;
import java.util.Scanner;

/*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    ((𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦))∗𝑡𝑔 𝑥𝑦
*/
public class Task3 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол x (в градусах)");
        x = scanner.nextDouble();
        System.out.println("Введите угол y (в градусах)");
        y = scanner.nextDouble();

        DecimalFormat dF = new DecimalFormat( "#.#####"); // set the output format
        double check = Math.round((Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y)))*1000)/100.0; // for checking division by 0

        if (check == 0){
            System.out.println("Некорректно введённые данные , произошло деление на 0");
        } else {
            z = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) / (Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))) * Math.tan(Math.toRadians(x * y));
            System.out.println("Значение выражения: " + dF.format(z));
        }
    }
}
