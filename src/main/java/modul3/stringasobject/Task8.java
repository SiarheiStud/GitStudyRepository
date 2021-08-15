package modul3.stringasobject;

import java.util.Scanner;
/*
8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        while (str.trim().equals("")){
            System.out.println("Введена пустая строка, либо одни пробелы. Введите строку заново:");
            str = scanner.nextLine();
        }
        System.out.println("Исходная строка:");
        System.out.println(str);
        String maxLongWord = "";
        String[] arrayStr = str.trim().split("\\s+");
        for (String element: arrayStr){
            if (element.length() > maxLongWord.length()) maxLongWord = element;
        }
        System.out.println("самое длинное слово: " + maxLongWord);
        scanner.close();
    }
}
