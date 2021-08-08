package modul2.decomposition;

import java.util.Scanner;
/*
14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.  Для решения задачи
использовать декомпозицию. 
 */
public class Task14 {

    public static int getCountDigits(int a){ // get the number of digits
        if(a == 0) return 1;
        int count = 0;
        while (a > 0){
            a /= 10;
            count++;
        }
        return count;
    }

    public static int sumDigits(int a){ // sum of digits to a power N
        if(a == 0) return 0;
        int sum = 0;
        int power = getCountDigits(a);
        while (a > 0){
            sum = sum + (int)Math.pow(a % 10 , power) ;
            a /= 10;
        }
        return sum;
    }

    public static void findArmstrongNumber(int k){ // find the Armstrong numbers
        System.out.println("Числа Армстронга в интервале от 1 до " + k);
        for (int i = 1; i <= k ; i++) {
            if(sumDigits(i) == i) System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число K");
        int k = MyMethods.getNaturalNumber(scanner);
        findArmstrongNumber(k);
        scanner.close();
    }
}
