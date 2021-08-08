package modul2.decomposition;

import java.util.Arrays;
/*
8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */
public class Task8 {

    public static int sumNumber(int[] array, int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] d = new int[6];
        MyMethods.fillArray(d);
        System.out.println("Исходный массив: " + Arrays.toString(d));
        System.out.println("Сумма с 1-го  по 3-й элемент = " + sumNumber(d, 0 , 2 ));
        System.out.println("Сумма с 3-го по 5-й элемент = " + sumNumber(d, 2 , 4 ));
        System.out.println("Сумма с 4-го по 6-й элемент = " + sumNumber(d, 3 , 5 ));
    }
}
