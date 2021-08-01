package Modul1.сycles;

import java.util.Scanner;

/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        int m, n; // range of values
        boolean delitel; // true when there are divisors (the digit 1 and the digit itself are not divisors)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение начала диапазона:");
        m = scanner.nextInt();
        System.out.println("Введите значение конца диапазона:");
        n = scanner.nextInt();

        if (n <= 0 || m <= 0){
            System.out.println("Не верено указан диапазон (диапазон натуральных чисел от 1, 2, 3 ... )");
        } else{
            for(int i = m; i <= n; i++){
                System.out.print("делителями числа " + i + " являются: ");
                delitel = false;
                for( int j = m; j <= n; j++ ){
                    if(j == 1 || j == i) continue;
                    if (i % j == 0){
                        System.out.print(j + "  ");
                        delitel = true;
                    }
                }
                if (!delitel) System.out.print("делителей нет");
                System.out.println();
            }
        }
    }
}
