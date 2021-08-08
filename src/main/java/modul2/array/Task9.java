package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
9. В массиве целых чисел с количеством элементов n  найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество элементов массива:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 1 || temp != (int)temp){
            System.out.println("Введено не корректное количество эелементов массива (не может быть отрицательным, " +
                    "дробным, либо равным 0 и 1)");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arr = new int[n];

        //************************************************************
        //                     fill the array
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(random.nextInt(10) * Math.pow(-1, random.nextInt(2) + 1));
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        //************************************************************
        //                main block of the program
        Arrays.sort(arr); //sorting the original array
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arr));

        int count = 1; //counter of identical elements
        int countMax = 0; //the number of most common elements
        int value = arr[0]; //value of most common elements
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] == arr[i+1]){
                count ++;
            }
            if (arr[i] != arr[i+1]){
                if(count > countMax){
                    value = arr[i];
                    countMax = count;
                }
                count = 1;
            }
            if (i == arr.length-2 &&  count > countMax ) {
                value = arr[i];
                countMax = count;
            }
        }
        System.out.println("Наименьшее наиболее часто встречающееся число: " + value);
        scanner.close();
    }
}
