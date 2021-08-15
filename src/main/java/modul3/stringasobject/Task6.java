package modul3.stringasobject;
/*
6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        String str = "It is important";
        System.out.println("Исходная строка:");
        System.out.println(str);
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sB.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println("Полученная строка:");
        System.out.println(sB);
    }
}
