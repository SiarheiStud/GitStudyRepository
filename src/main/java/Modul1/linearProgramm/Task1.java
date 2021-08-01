package Modul1.linearProgramm;
//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a,b,c,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        a = scanner.nextDouble();
        System.out.println("Введите b");
        b = scanner.nextDouble();
        System.out.println("Введите c");
        c = scanner.nextDouble();
        z=((a-3)*b/2)+c;
        System.out.println("Значение функции z = " + z);
    }
}
