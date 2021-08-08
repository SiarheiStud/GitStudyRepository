package modul2.decomposition;

import java.util.Arrays;
import java.util.Scanner;
/*
10.  Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого
являются цифры числа N.
 */
public class Task10 {
    public static int getLengthArray(int n){
        int length = 0;
        while (n > 0){
            length++;
            n = n / 10;
        }
        return length;
    }

    public static void fillArray(int[] array, int n){
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = MyMethods.getNaturalNumber(scanner); // enter the number
        int lengthArray = getLengthArray(n); // get length array
        int[] arr = new int[lengthArray];
        fillArray(arr, n); // fill the array digits of the entered number
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        scanner.close();
    }
}
