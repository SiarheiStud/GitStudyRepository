package modul2.decomposition;

import java.util.Scanner;

/*
6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

Числа взаимно простые, если у них нет общих делителей кроме цифры 1.
 */
public class Task6 {

    public static int maxOD(int a, int b){ // checks if two numbers are mutually simple
        if(a % b == 0) return b;
        if(b % a == 0) return a;
        else {
            while (a != 0 && b != 0) {
                if (a > b) a = a % b;
                else b = b % a;
            }
            return  a + b;
        }
    }

    public static boolean maxODThree(int a, int b , int c) { // checks if three numbers are mutually simple
        return maxOD(a, b) == 1 && maxOD(a, c) == 1 && maxOD(b, c) == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите второе число:");
        int b = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите третье число:");
        int c = MyMethods.getNaturalNumber(scanner);
        System.out.println("Первое число: " + a + ", второе число: " + b + ", третье число: " + c);
        if(maxODThree(a, b, c)) System.out.println("Данные три числа взаимно простые");
        else System.out.println("Данные три числа не являются взаимно простыми");
        scanner.close();
    }
}
