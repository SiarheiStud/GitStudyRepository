package modul2.array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
7. Даны действительные числа a[1], a[2], ..., a[n] . Найти max(a[1]+a[2n], a[2]+a[2n-1],..., a[n]+a[n+1])
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat( "#.#"); // set the output format

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество действительных чисел:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 1 || temp != (int)temp){
            System.out.println("Введено не корректное количество действительных чисел (не может быть отрицательным, " +
                    "дробным, либо равным 0 и 1)");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        double[] arr = new double[n];

        //************************************************************
        //                     fill the array
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (double)random.nextInt(100)/10 * Math.pow(-1, random.nextInt(2) + 1);
        }
        System.out.println("Исходная последовательность действительных чисел: ");
        System.out.println(Arrays.toString(arr));

        //************************************************************
        //                main block of the program
        int maxIndexI = 0; // 1st element index
        int maxIndexJ = n-1; // last element index
        double maxValue = arr[maxIndexI] + arr[maxIndexJ]; //the 1st and the last value was taken as the maximum
        for(int i = 1, j = n - 2; i < j; i++, j--){ //so we search start from the 2nd and the n-2 value
            if (arr[i] + arr[j] > maxValue) {
                maxValue = arr[i] + arr[j];
                maxIndexI = i;
                maxIndexJ = j;
            }
        }
        System.out.println("max при a[" + maxIndexI + "]=" + arr[maxIndexI] +
                "  a[" + maxIndexJ + "]=" + arr[maxIndexJ] + "  max = " + dF.format(maxValue));
        scanner.close();
    }
}
