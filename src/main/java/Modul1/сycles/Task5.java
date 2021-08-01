package Modul1.сycles;

import java.util.Scanner;

/*
5.  Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен
заданному е. Общий член ряда имеет вид:    a[n] = 1/2^n + 1/3^n
 */
public class Task5 {
    public static void main(String[] args) {
        int n; // number of elements in a row
        double e , element; //
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов ряда:");
        n = scanner.nextInt();
        System.out.println("Введите число e:");
        e = scanner.nextDouble();

        for(int i = 1; i <= n; i++){
            element = 1/Math.pow(2, i) + 1/Math.pow(3, i);
            if (Math.abs(element) >= e){
                sum = sum + element;
            }
        }
        System.out.println("Сумма членов ряда, модуль которых больше или равен заданному е: " + sum);
    }
}
