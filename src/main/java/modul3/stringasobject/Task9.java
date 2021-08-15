package modul3.stringasobject;

import java.util.Scanner;
/*
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */
public class Task9 {
    public static void main(String[] args) {
        int countUpCase = 0;
        int countDownCase = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        while (str.trim().equals("")){
            System.out.println("Введена пустая строка, либо одни пробелы. Введите строку заново:");
            str = scanner.nextLine();
        }
        System.out.println("Исходная строка: ");
        System.out.println(str + "\n");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) countDownCase++;
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) countUpCase++;
        }
        System.out.println("Количество строчных (маленьких английских) букв в строке: " + countDownCase);
        System.out.println("Количество прописных (больших английских) букв в строке: " + countUpCase);
        scanner.close();
    }
}
