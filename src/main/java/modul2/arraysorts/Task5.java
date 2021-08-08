package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
5. Сортировка вставками. Дана последовательность чисел a[1], a[2], ..., a[n]. Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a[1], a[2], ..., a[i]   -  упорядоченная последовательность,
т. е. a[1]<=a[2]<=...<=a[n].  Берется  следующее  число a[i+1]  и  вставляется  в  последовательность  так,  чтобы  новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {

    public  static int binarySearch (int [] array , int starIndex , int endIndex , int value){ //binary search function
        int midlIndex = starIndex + (endIndex - starIndex)/2;
        while(starIndex <= endIndex){
            midlIndex = starIndex + (endIndex - starIndex)/2;
            if(array[midlIndex] == value) return midlIndex;
            if(starIndex == endIndex){
                if(array[midlIndex] > value){
                    return midlIndex;
                }else return midlIndex+1;
            }
            if(array[midlIndex] > value){
                endIndex = midlIndex - 1;
            } else {
                starIndex = midlIndex +1;
            }
        }
        return midlIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the array
        System.out.println("Введите количество элементов последовательности :");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));
        //************************************************************
        //                main block of the program
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i;
            if (arr[j - 1] > currentValue){
                j = binarySearch(arr, 0, j - 1, currentValue);// position to insert the current value
                System.arraycopy(arr, j, arr, j + 1, i - j); // shift the elements of the array
            }
            arr[j] = currentValue;
        }
        System.out.println("Отсортированный по возрастанию массив");
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
