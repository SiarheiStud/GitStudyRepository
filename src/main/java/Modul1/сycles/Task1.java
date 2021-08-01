package Modul1.сycles;

import java.util.Scanner;

/*
1. Напишите программу, где пользователь вводит любое  целое  положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int value;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое  целое  положительное число");
        value = scanner.nextInt();

        for(int i = 1; i < value; i++)
            sum = sum + i;

        System.out.println("Сумма чисел (до введённого числа): " + sum);
    }
}
