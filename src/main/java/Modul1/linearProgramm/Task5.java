package Modul1.linearProgramm;

import java.util.Scanner;

/*
5.  Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Task5 {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное  число  Т  (секунд)");
        t = scanner.nextInt();
        System.out.println(t / 3600 % 24  +"ч " + t % 3600 / 60 + "мин " + t % 60 + "сек");
    }
}
