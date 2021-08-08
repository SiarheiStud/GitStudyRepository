package modul2.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of elements in the array
        System.out.println("Введите количество действительныч чисел:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное количество действительныч чисел (не может быть отрицательным, " +
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
        int minIndex = 0; //minimal element index
        int maxIndex = 0; //maximum element index
        double minElement = arr[minIndex]; //minimal element value
        double maxElement = arr[maxIndex]; //maximum element value
        for(int i = 0; i < arr.length; i++){
            if (minElement > arr[i]){
                minElement = arr[i];
                minIndex = i;
            }
            if (maxElement < arr[i]){
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        arr[maxIndex] = minElement;
        arr[minIndex] = maxElement;
        System.out.println("Последовательность чисел после преобразования:");
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
