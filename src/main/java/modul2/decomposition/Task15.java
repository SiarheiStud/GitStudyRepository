package modul2.decomposition;

import java.util.Scanner;
/*
15.  Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task15 {

    public static boolean isInkrNumber(int a) { //numbers in which the digits form a strictly increasing subsequence
        if (a <= 9) return false;
        boolean isInkr = false; // true if increasing subsequence
        while (a > 0){
            int temp = a % 10;
            a = a / 10;
            if(a % 10 < temp) isInkr = true;
            else return false;
            if (a / 10 == 0) return isInkr;
        }
        return isInkr;
    }

    public static void findNumber(int n){
        System.out.println("Натуральные числа, цифры в которых образуют строго возрастающую последовательность:");
        if (n == 1 ) System.out.println("Такие числа отсутствуют.");
        else {
            int startNumber = (int)Math.pow(10 , n-1);
            int lastNumber = startNumber * 10 - 1;
            for (int i = startNumber; i <= lastNumber ; i++) {
                if (isInkrNumber(i)) System.out.print(i + "  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите разрядность чисел:");
        int n = MyMethods.getNaturalNumber(scanner);
        findNumber(n);
        scanner.close();
    }
}
