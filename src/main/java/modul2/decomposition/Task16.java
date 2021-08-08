package modul2.decomposition;

import java.util.Scanner;
/*
16.  Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {

    public static boolean isOddDigits(int a) { //numbers containing only odd digits
        boolean isOdd = false; // true if odd digits
        while (a > 0){
            int temp = a % 10;
            if(temp % 2 != 0) isOdd = true;
            else return false;
            a = a / 10;
        }
        return isOdd;
    }

    public static int findNumber(int n){
        System.out.println("Натуральные числа, цифры в которых только  нечетные:");
        int startNumber = (int)Math.pow(10 , n-1);
        int lastNumber = startNumber * 10 - 1;
        int sum = 0; //Sum of numbers with only odd digits
        for (int i = startNumber; i <= lastNumber ; i++) {
            if (isOddDigits(i)) {
                System.out.print(i + "  ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Сумма чисел, цифры в которых только  нечетные: " + sum);
        return sum;
    }

    public static void countEvenDigits(int a) { //numbers containing only odd digits
        int count = 0;
        while (a > 0){
            int temp = a % 10;
            if(temp % 2 == 0) count++;
            a = a / 10;
        }
        System.out.println("Количество чётных цифр в числе: " +count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите разрядность чисел:");
        int n = MyMethods.getNaturalNumber(scanner);
        int sumNumber = findNumber(n); //Sum of numbers with only odd digits
        countEvenDigits(sumNumber);
        scanner.close();
    }
}
