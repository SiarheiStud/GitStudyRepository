package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
4.  Сортировка  обменами.  Дана  последовательность  чисел a[1]<=a[2]<=...<=a[n].Требуется  переставить  числа  в
порядке  возрастания.  Для  этого  сравниваются  два  соседних  числа a[i] и a[i+1] .  Если a[i] > a[i+1] ,  то  делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
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
        arr[0] = random.nextInt(10);
        for (int i = 1; i < arr.length; i++){
            while (arr[i] < arr[i-1]){
                arr[i] = random.nextInt(100);
            }
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));
        //************************************************************
        //                main block of the program
        int countReplace = 0; //number of replacements
        for(int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if(arr[j-1] < arr[j]){
                    int tempValue = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tempValue;
                    countReplace ++;
                }
                System.out.println("стадия " + i + "  "+ Arrays.toString(arr));
            }
        }
        System.out.println("Отсортированный по убыванию массив");
        System.out.println(Arrays.toString(arr));
        System.out.println("количества перестановок: " + countReplace);
        scanner.close();
    }
}
