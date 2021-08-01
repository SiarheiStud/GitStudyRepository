package Modul1.conditional;

import java.util.Scanner;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        double a, b, x, y, z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину отверстия");
        a = scanner.nextDouble();
        System.out.println("Введите ширину отверстия");
        b = scanner.nextDouble();
        System.out.println("Введите длину кирпича");
        x = scanner.nextDouble();
        System.out.println("Введите ширину кирпича");
        y = scanner.nextDouble();
        System.out.println("Введите высоту кирпича");
        z = scanner.nextDouble();

        if ((a>=x && b>=y) || (a>=x && b>=z) || (a>=y && b>=x) || (a>=y && b>=z) || (a>=z && b>=x) || (a>=z && b>=y)) {
            System.out.println("кирпич пройдёт через отверстие");
        } else System.out.println("кирпич не пройдёт через отверстие");
    }
}
