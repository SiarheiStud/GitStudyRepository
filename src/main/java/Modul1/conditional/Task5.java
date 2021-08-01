package Modul1.conditional;

import java.util.Scanner;

/*
5. Вычислить значение функции: x^2-3x+9 , если x<=3    1/(x^3+6) если x>3
 */
public class Task5 {
    public static void main(String[] args) {
        double x, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        x = scanner.nextDouble();

        if (x<=3){
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1/(Math.pow(x, 3) + 6);
        }
        System.out.println("Вычесленное значение функции: " + result);
    }
}
