package modul2.decomposition;

import java.util.Scanner;

/*
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:   НОК(A,B) = A*B/НОД(A,B)
 */
public class Task1 {

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

    public static int minOK(int a, int b, int divisor){ // min common multiple of two numbers
        return a * b / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = MyMethods.getNaturalNumber(scanner);
        int b = MyMethods.getNaturalNumber(scanner);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        int delitel = maxOD(a, b);
        System.out.println("Наибольший общий делитель = " + delitel);
        int kratnoe = minOK(a, b , delitel);
        System.out.println("Наименьшеe общеe кратное = " + kratnoe);
        scanner.close();
    }
}
