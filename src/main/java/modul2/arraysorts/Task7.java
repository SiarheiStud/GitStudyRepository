package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
7. Пусть даны две неубывающие последовательности действительных чисел a[1]<=a[2]<=...<=a[n] и b[1]<=b[2]<=...<=b[m].
Требуется указать те места, на которые нужно вставлять элементы последовательности b[1]<=b[2]<=...<=b[m] в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the first array
        System.out.println("Введите количество элементов в первой последовательности:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int m = (int) temp;
        int[] arr1 = new int[m];
        arr1[0] = random.nextInt(10);
        for (int i = 1; i < arr1.length; i++){
            while (arr1[i] < arr1[i-1]){
                arr1[i] = (int)(random.nextInt(100) * Math.pow(-1, random.nextInt(2) + 1));
            }
        }
        System.out.println("1-я последовательность:" + Arrays.toString(arr1));

        //************************************************************
        //            form the second array
        System.out.println("Введите количество элементов во второй последовательности:");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arr2 = new int[n];
        arr2[0] = random.nextInt(10);
        for (int i = 1; i < arr2.length; i++){
            while (arr2[i] < arr2[i-1]){
                arr2[i] = (int)(random.nextInt(100) * Math.pow(-1, random.nextInt(2) + 1));
            }
        }
        System.out.println("2-я последовательность:" + Arrays.toString(arr2));

        //************************************************************
        //                main block of the program
        int[] resultArray = new int [arr1.length + arr2.length];
        System.arraycopy(arr1, 0, resultArray,0, arr1.length);
        System.arraycopy(arr2, 0, resultArray, arr1.length, arr2.length);
        int countElemArray2 = 1; // counter element of array2
        for (int i = arr1.length; i < resultArray.length; i++) {
            int j = i;
            int currentValue = resultArray[j]; // relocate element
            while (j > 0 && resultArray[j-1] > currentValue){
                resultArray[j] = resultArray[j-1];
                j--;
            }
            System.out.println(countElemArray2 + "-й элемент = " + currentValue +" помещается в индекс " + j + " итогового массива");
            resultArray[j] = currentValue;
            countElemArray2++;
        }
        System.out.println("Получившаяся послежовательность");
        System.out.println(Arrays.toString(resultArray));
        scanner.close();
    }
}
