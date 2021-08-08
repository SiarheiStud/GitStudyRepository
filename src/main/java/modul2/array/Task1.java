package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество элементов в массиве:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное количество эелементов массива (не может быть отрицательным, " +
                    "дробным, либо равным 0)");
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
        //                        Enter number K
        System.out.println("Введите число К (целое число), по которому будут искаться кратные элементы в массиве:");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректно число К (число К не может быть отрицательным, дробным, " +
                    "либо равным 0)");
            temp = scanner.nextDouble();
        }
        int k = (int) temp;

        //************************************************************
        //The sum of the array elements are multiples of the number K
        int sum = 0;
        for (int i : arr) {
            if (i % k == 0) sum = sum + i;
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма элементов массива кратных числу " + k + " равна: " + sum);
        scanner.close();
    }
}
