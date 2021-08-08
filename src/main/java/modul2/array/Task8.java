package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
8.  Дана  последовательность  целых  чисел a[1], a[2], ..., a[n].  Образовать  новую  последовательность,  выбросив  из
исходной те члены, которые равны min(a[1], a[2], ..., a[n]).
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество элементов в последовательности:");
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
        System.out.println("Исходная последовательность чисел: ");
        System.out.println(Arrays.toString(arr));

        //************************************************************
        //                main block of the program
        int minValue = arr[0]; //minimum element value
        int countMinElement = 1; //count of minimum elements
        for(int i = 1; i < arr.length; i++){
            if (arr[i] == minValue) countMinElement++;
            if (arr[i] < minValue) {
                minValue = arr[i];
                countMinElement = 1;
            }
        }
        int[] arrNew = new int[n - countMinElement];
        int j = 0;
        for(int elementArr : arr){
            if (elementArr != minValue){
                arrNew[j] = elementArr;
                j++;
            }
        }
        System.out.println("Новая последовательность:");
        System.out.println(Arrays.toString(arrNew));
        scanner.close();
    }
}
