package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
6.  Сортировка Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
Делается это следующим образом: сравниваются два соседних элемента a[i] и a[i+1] . Если a[i] < a[i+1] , то продвигаются
на один элемент вперед. Если a[i] > a[i+1] , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the array
        System.out.println("Введите количество элементов массива :");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(random.nextInt(100) * Math.pow(-1, random.nextInt(2) + 1));
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));
        //************************************************************
        //                main block of the program
        int step = arr.length / 2;
        while (step > 0){
            for (int i = step; i < arr.length ; i++) {
                for (int j = i; j >= step && arr[j] < arr[j - step]; j -= step) {
                    int tempValue = arr[j];
                    arr[j] = arr[j - step];
                    arr[j - step] = tempValue;
                }
            }
            step = step / 2;
        }
        System.out.println("Отсортированный по возрастанию массив");
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
