package modul2.decomposition;

import java.util.Scanner;
/*
2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {

    public static int maxOD(int a, int b){ //greatest common divisor of two numbers
        if (a % b == 0) return b;
        if (b % a == 0) return a;
        else {
            while (a !=0 && b !=0){
                if(a > b) a = a % b;
                else b = b % a;
            }
        }return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int a = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите натуральное число:");
        int b = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите натуральное число:");
        int c = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите натуральное число:");
        int d = MyMethods.getNaturalNumber(scanner);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);

        int result = maxOD(maxOD(a, b), maxOD(c, d));
        System.out.println("Наибольший общий делитель четырех натуральных чисел: " + result);
        scanner.close();
    }
}
