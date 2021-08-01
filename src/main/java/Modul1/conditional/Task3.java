package Modul1.conditional;

import java.util.Scanner;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        int x1, x2, x3, y1, y2, y3;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x1");
        x1 = scanner.nextInt();
        System.out.println("Введите координату y1");
        y1 = scanner.nextInt();
        System.out.println("Введите координату x2");
        x2 = scanner.nextInt();
        System.out.println("Введите координату y2");
        y2 = scanner.nextInt();
        System.out.println("Введите координату x3");
        x3 = scanner.nextInt();
        System.out.println("Введите координату y3");
        y3 = scanner.nextInt();

        result = (x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1);
        if (result == 0) System.out.println("Точки расположены на одной прямой");
        else System.out.println("Точки не расположены на одной прямой");
    }
}
