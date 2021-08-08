package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя
дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the first array
        System.out.println("Введите размерность первого массива:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректная размерность массива (не может быть отрицательной, " +
                    "дробной, либо равной 0 )");
            temp = scanner.nextDouble();
        }
        int m = (int) temp;
        int[] arr1 = new int[m];
        Arrays.fill(arr1, random.nextInt(10));
        System.out.println("1-й массив:" + Arrays.toString(arr1));

        //************************************************************
        //            form the second array
        System.out.println("Введите размерность второго массива:");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректная размерность массива (не может быть отрицательной, " +
                    "дробной, либо равной 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arr2 = new int[n];
        Arrays.fill(arr2, random.nextInt(10));
        System.out.println("2-й массив:" + Arrays.toString(arr2));

        //************************************************************
        //                main block of the program

        //                  enter the number K
        System.out.println("Введите целое число K :");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= -1 || temp != (int)temp || temp > m){
            System.out.println("Введено не корректное число (не может быть отрицательным, дробным, " +
                    "и больше чем " + m +" (болшим чем размерность первого массива)");
            temp = scanner.nextDouble();
        }
        int k = (int) temp;

        int[] sumArray = new int [arr1.length + arr2.length];
        int j = 0; //index counter arr2

        for(int i = 0; i < sumArray.length; i++){
            if(i <= k - 1){
                sumArray[i] = arr1[i];
            }else if(j < arr2.length) {
                sumArray[i] = arr2[j];
                j++;
            }else sumArray[i] = arr1[i - arr2.length - 1];

        }
        System.out.println(Arrays.toString(sumArray));
        scanner.close();
    }
}
