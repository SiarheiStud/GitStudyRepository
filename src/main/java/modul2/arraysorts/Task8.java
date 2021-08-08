package modul2.arraysorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
8.Даны дроби p[1]/q[1], p[2]/q[2], ..., p[n]/q[n] (p[i], q[i] - натуральные). Составить программу, которая
приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //************************************************************
        //            form the first array
        System.out.println("Введите количество дробей:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное число (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int m = (int) temp;
        int[] arrNum = new int[m]; // numerator array
        int[] arrDenom = new int[m]; // denominator array
        for (int i = 0; i < m; i++){
            arrNum[i] = (int)(random.nextInt(20) * Math.pow(-1, random.nextInt(2) + 1));
            arrDenom[i] = random.nextInt(10) +1;
        }
        System.out.println("Числительи: " + Arrays.toString(arrNum));
        System.out.println("Знаменатели: " + Arrays.toString(arrDenom) );

        //************************************************************
        //                main block of the program
        int denominator = arrDenom[0]; // common denominator
        for (int i = 1; i < arrDenom.length ; i++) {
            if (denominator % i != 0) denominator = denominator * arrDenom[i];
        }
        System.out.println("Общий знаменатель равен: " + denominator);

        for (int i = 1; i < arrNum.length ; i++) {
            arrNum[i] *= denominator;
        }
        Arrays.sort(arrNum);
        System.out.println("Полученная последовательность дробей:");
        for (int element: arrNum) {
            System.out.print(element + "/" + denominator + "   ");
        }
        scanner.close();
    }
}
