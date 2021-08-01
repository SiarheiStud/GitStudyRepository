package Modul1.conditional;

import java.util.Scanner;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */
public class Task1 {
    public static void main(String[] args) {
        int angle1, angle2, angle3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите знчение первого угла треугольника ");
        angle1 = scanner.nextInt();
        System.out.println("Введите знчение второго угла треугольника ");
        angle2 = scanner.nextInt();

        angle3 = 180 - angle1 - angle2;
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0 || (angle1 + angle2 + angle3) > 180 ){
            System.out.println("Треугольника не существет");
        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90){
            System.out.println("Треугольник прямоугольный");
        } else System.out.println("Треугольник существет");
    }
}
