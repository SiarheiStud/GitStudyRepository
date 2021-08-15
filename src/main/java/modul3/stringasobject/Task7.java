package modul3.stringasobject;

import java.util.Scanner;
/*
7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef"
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        while (str.equals("")){
            System.out.println("Введена пустая строка. Введите строку заново:");
            str = scanner.nextLine();
        }
        System.out.println("Исходная строка:");
        System.out.println(str);
        StringBuilder sB = new StringBuilder(str.trim());
        int index;
        for (int i = 0; i < sB.length() - 1; i++) {
            while (sB.charAt(i) == ' ') sB.deleteCharAt(i);
            do {
                index = sB.indexOf(String.valueOf(sB.charAt(i)), i+1);
                if (index != -1) sB.deleteCharAt(index);
            } while (index != -1);
        }
        System.out.println("Полученная строка:");
        System.out.println(sB);
        scanner.close();
    }
}
