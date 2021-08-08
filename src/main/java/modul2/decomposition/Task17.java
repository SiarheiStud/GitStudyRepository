package modul2.decomposition;

import java.util.Scanner;
/*
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task17 {

    public static int sumDigits(int number){ // find sum of digits of a number
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void subtracting(int number){ // subtracting the sum of digits from a number
        int count = 0; // amount of subtractions
        while (number != 0){
            number = number - sumDigits(number);
            count++;
        }
        System.out.println("Количество вычитаний из числа суммы его цифр , до получения цифры ноль: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = MyMethods.getNaturalNumber(scanner);
        subtracting(n);
    }
}
