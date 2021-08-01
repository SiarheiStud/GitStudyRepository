package Modul1.conditional;

import java.util.Scanner;

/*
2. Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
    public static void main(String[] args) {
        double a, b, c, d;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        a = scanner.nextDouble();
        System.out.println("Введите b");
        b = scanner.nextDouble();
        System.out.println("Введите c");
        c = scanner.nextDouble();
        System.out.println("Введите d");
        d = scanner.nextDouble();
        result = Math.max(Math.min(a, b), Math.min(c, d));
        // alternative solution
        //result = (a < b ? a : b) > (c < d ? c : d) ? (a < b ? a : b) : (c < d ? c : d);
        System.out.println("Результат выражения : " + result);
    }
}
