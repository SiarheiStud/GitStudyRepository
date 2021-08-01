package Modul1.сycles;
/*
6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
https://www.ascii-code.com/
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println("В диапазоне чисел 0-31 находятся Управляющие символы.");
        System.out.println("Печатные символы:");
        for (int i = 32; i < 255; i++) {
            if (i == 32) System.out.println("Числу " + i + " соответствует символ:" + (char)i + " (пробел)");
            if(i > 32) System.out.println("Числу " + i + " соответствует символ:" + (char)i);
        }
    }
}
