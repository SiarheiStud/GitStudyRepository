package modul2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  -  заданное натуральное число больше 2.  Для
решения задачи использовать декомпозицию.
 */
public class Task13 {

    public static void fillArray(int[] array, int n){  // fill the array
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
        }
    }

    public static boolean isSimple(int a){
        if (a < 4 && a != 2) return true; // if number is simple = true
        boolean simple = false;
        for (int i = 2; i < a-1 ; i++) {
            if (a % i != 0) {
                simple = true;
            }
            else return false;
        }
        return simple;
    }

    public static void twinsNumber(int[] array){
        System.out.println("Пары простых чисел близнецов на заданном отрезке:");
        for (int i = 0; i < array.length - 2; i++) {
            if (isSimple(array[i]) && isSimple(array[i + 2])) System.out.println(array[i] + "  " + array[i + 2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число N больше 2:");
        int n = MyMethods.getNaturalNumber(scanner); // enter the number
        while (n < 2){
            System.out.println("Введено не корректное натуральное число (по условию задачи число должно быть больше 2)");
            n = MyMethods.getNaturalNumber(scanner); // enter the number
        }

        int[] arr = new int[n * 2];
        fillArray(arr, n);
        System.out.println("Исходный отрезок:" + Arrays.toString(arr));
        twinsNumber(arr);
        scanner.close();
    }
}
