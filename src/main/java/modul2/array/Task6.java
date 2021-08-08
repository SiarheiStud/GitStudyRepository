package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
6. Задана последовательность N  вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество вещественных чисел:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное количество вещественных чисел (не может быть отрицательным, " +
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
        System.out.println("Исходная последовательность вещественных чисел: ");
        System.out.println(Arrays.toString(arr));

        //************************************************************
        //                main block of the program
        double sum = 0;
        boolean simpleValue = true; // false if divisor is found
        for(int i = 1; i < arr.length; i++){
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0) {
                    simpleValue = false;
                    break;
                }
            }
            if (simpleValue) sum = sum + arr[i];
            simpleValue = true;
        }
        System.out.printf("сумма чисел, порядковые номера которых являются простыми числами %.1f:", sum);
        scanner.close();
    }
}
