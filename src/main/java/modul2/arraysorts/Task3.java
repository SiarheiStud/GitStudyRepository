package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
3. Сортировка выбором. Дана последовательность чисел a[1]<=a[2]<=...<=a[n] .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the array
        System.out.println("Введите количество элементов последовательности :");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arr = new int[n];
        arr[0] = random.nextInt(10);
        for (int i = 1; i < arr.length; i++){
            while (arr[i] < arr[i-1]){
                arr[i] = random.nextInt(100);
            }
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));
        //************************************************************
        //                main block of the program
        for(int i = 0; i < arr.length; i++){
            int maxIndex = i;
            int maxValue = arr[i];
            for(int j = i; j < arr.length; j++){
                if(maxValue < arr[j]){
                    maxIndex = j;
                    maxValue = arr[j];
                }
            }
            arr[maxIndex] = arr[i];
            arr[i] = maxValue;
        }
        System.out.println("Отсортированный по убыванию массив");
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
