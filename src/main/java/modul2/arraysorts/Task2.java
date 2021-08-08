package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
2. Даны две последовательности  a[1]<=a[2]<=...<=a[n], и b[1]<=b[2]<=...<=b[m] . Образовать из них новую
последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the first array
        System.out.println("Введите количество элементов 1-й последовательности :");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arrA = new int[n];
        arrA[0] = random.nextInt(10);
        for (int i = 1; i < arrA.length; i++){
            while (arrA[i] < arrA[i-1]){
                arrA[i] = random.nextInt(100);
            }
        }

        //************************************************************
        //            form the second array
        System.out.println("Введите количество элементов 2-й последовательности :");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int m = (int) temp;
        int[] arrB = new int[m];
        arrB[0] = random.nextInt(11);
        for (int i = 1; i < arrB.length; i++){
            while (arrB[i] < arrB[i-1]){
                arrB[i] = random.nextInt(100);
            }
        }

        //************************************************************
        //                main block of the program
        int[] resultArray = new int[arrA.length + arrB.length];
        int j = 0; // counter index array A
        int k = 0; // counter index array B
        for(int i = 0; i < resultArray.length; i++){
            if (j == arrA.length){
                resultArray[i] = arrB[k];
                k++;
            }else if (k == arrB.length){
                resultArray[i] = arrA[j];
                j++;
            }else if(j < arrA.length && arrA[j] <= arrB[k]){
                resultArray[i] = arrA[j];
                j++;
            }else if (k < arrB.length && arrA[j] > arrB[k]){
                resultArray[i] = arrB[k];
                k++;
            }
        }
        System.out.println("1-я последовательность:" + Arrays.toString(arrA));
        System.out.println("2-я последовательность:" + Arrays.toString(arrB));
        System.out.println("Итоговая последовательнсть:");
        System.out.println(Arrays.toString(resultArray));
        System.out.println();

        System.out.println("Простой способ, сложить оба массива в один и отсортировать:");
        System.arraycopy(arrA,0, resultArray,0, arrA.length);
        System.arraycopy(arrB,0, resultArray, arrA.length, arrB.length);
        Arrays.sort(resultArray);
        System.out.println("Итоговая последовательнсть:");
        System.out.println(Arrays.toString(resultArray));
        scanner.close();
    }
}
