package modul2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
12. Даны натуральные числа К и N.  Написать метод(методы)  формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task12 {
    public static int countElement(int k, int n){ // the number of elements that satisfy the condition of the task
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            int sumDigits = 0;
            int j = i;
            while (j > 0){
                sumDigits = sumDigits + j % 10;
                j /=10;
            }
            if(sumDigits == k && sumDigits <= n) count++;
        }
        return count;
    }

    public static void fillArrayA(int[] array, int k, int n){  // fill the array
        int index = 0;
        for (int i = 1; i <= n ; i++) {
            int sumDigits = 0;
            int j = i;
            while (j > 0){
                sumDigits = sumDigits + j % 10;
                j /=10;
            }
            if(sumDigits == k && sumDigits <= n){
                array[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число К:");
        int k = MyMethods.getNaturalNumber(scanner); // enter the number
        System.out.println("Введите натуральное число N:");
        int n = MyMethods.getNaturalNumber(scanner); // enter the number
        int lengthArray = countElement(k, n);
        System.out.println("Количество элементов удовлетворяющие условию задачи: " + lengthArray);
        int[] arrA = new int[lengthArray];
        fillArrayA(arrA, k, n);
        System.out.println("Полученный массив А: " + Arrays.toString(arrA));
        scanner.close();
    }
}
