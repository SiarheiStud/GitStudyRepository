package Modul1.сycles;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
2. Вычислить значения функции на отрезке [а,b] c шагом h

        |x, x>2
 F(x)= <|
        |-x, x<=2

 */
public class Task2 {
    public static void main(String[] args) {
        double a, b, h, x;
        DecimalFormat dF = new DecimalFormat( "#.###"); // set the output format of the function values

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение начала отрезка:");
        a = scanner.nextDouble();
        System.out.println("Введите значение конца отрезка:");
        b = scanner.nextDouble();
        System.out.println("Введите шаг:");
        h = scanner.nextDouble();

        x = a;
        while (x >= a && x <= b){
            if(x <= 2){
                System.out.println("x=" + dF.format(x) + "   F(x)=" + dF.format(-x));
                x += h;
            } else {
                System.out.println("x=" + dF.format(x) + "   F(x)=" + dF.format(x));
                x += h;
            }
        }
    }
}
