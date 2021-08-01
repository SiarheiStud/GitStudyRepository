package Modul1.linearProgramm;

import java.util.Scanner;

/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */
public class Task6 {
    public static void main(String[] args) {
        boolean result;
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x ");
        x = scanner.nextInt();
        System.out.println("Введите координату y ");
        y = scanner.nextInt();
        result = (-2<=x) && (x<=2) && (y<=4) && (y>=0) || (-4<=x) && (x<=4) && (y<=0) && (y>=-3);
        System.out.println(result);
    }
}
