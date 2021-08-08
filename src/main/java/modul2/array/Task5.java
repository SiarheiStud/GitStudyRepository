package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество целых чисел:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное количество целых чисел (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
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
        System.out.println("Числа для которых а[i] > i");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > i) System.out.println("а[i] = " + arr[i] + "  i =" + i);
        }
        scanner.close();
    }
}
