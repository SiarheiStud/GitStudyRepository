package Modul1.linearProgramm;

import java.util.Scanner;

/*
 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    z=((b+sqrt(b^2 + 4ac))/(2a)-3^3 * c + b^(-2)
*/
public class Task2 {
    public static void main(String[] args) {
        double a,b,c,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        a = scanner.nextDouble();
        System.out.println("Введите b");
        b = scanner.nextDouble();
        System.out.println("Введите c");
        c = scanner.nextDouble();

        z = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/(2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.println("Результат вычисления: " + z);
    }
}
