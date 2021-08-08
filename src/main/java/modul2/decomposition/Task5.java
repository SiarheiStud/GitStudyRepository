package modul2.decomposition;

import java.util.Arrays;
import java.util.Scanner;
/*
5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов в массиве:");
        int n = MyMethods.getNaturalNumber(scanner);
        int[] arr = new int [n];
        MyMethods.fillArray(arr);//fill the array

        //************************************************************
        //                main block of the program
        System.out.println("Массив значений: " + Arrays.toString(arr));
        if(n == 1){
            System.out.println("В массиве 1 число,  второе по величине число отсутствует.");
        }else{
            int maxFirst;
            int maxSecond;
            if (arr[0] > arr[1]){
                maxFirst = arr[0];
                maxSecond = arr[1];
            }else{
                maxFirst = arr[1];
                maxSecond = arr[0];
            }

            for (int element : arr) {
                if (element > maxFirst) {
                    maxSecond = maxFirst;
                    maxFirst = element;
                }
                if (element < maxFirst && element > maxSecond) maxSecond = element;
            }
            System.out.println("Второе по величине число: " + maxSecond);
        }
        scanner.close();
    }
}
