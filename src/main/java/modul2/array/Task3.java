package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
3.  Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
положительных и нулевых элементов.
 */
public class Task3 {
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
        int countZero = 0; //amount of numbers equal to zero
        int countNegative = 0; //amount of negative numbers
        int countPositive = 0; //amount of positive numbers
        for(double i : arr){
            if(i == 0){
                countZero++;
            } else if(i < 0){
                countNegative++;
            } else countPositive++;
        }
        System.out.println("Количество отрицательных элементов: " + countNegative);
        System.out.println("Количество положительных элементов: " + countPositive);
        System.out.println("Количество нулевых элементов: " + countZero);
        scanner.close();
    }
}
