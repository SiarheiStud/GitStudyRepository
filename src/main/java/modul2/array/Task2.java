package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double[] arr = {12.56, -6.56, 65.54, 0, 10, -15.5, 33.99};
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
        System.out.println("Введите число Z:");
        double z = scanner.nextDouble();
        int replace = 0;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > z){
                arr[i] = z;
                replace++;
            }
        }
        System.out.println("Последовательность после преобразования:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество заменённых элементов = " + replace);
        scanner.close();
    }
}
