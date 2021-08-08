package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество элементов массива:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное количество эелементов массива (не может быть отрицательным, " +
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
        int unnecessaryElem = 1; //from this index we fill the array with zero
        if(arr.length % 2 == 0){ //check the array contains an even or odd number of elements
            for(int i = 1; i < arr.length/2; i++) { //transform the array
                arr[i] = arr[i * 2];
                unnecessaryElem = arr.length/2;
            }
        } else {
            for (int i = 1; i < arr.length / 2 + 1; i++) { //transform the array
                arr[i] = arr[i * 2];
                unnecessaryElem = arr.length / 2 + 1;
            }
        }
        for (int i = unnecessaryElem; i < arr.length; i++ )
            arr[i] = 0;
        System.out.println("Полученый массив");
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
