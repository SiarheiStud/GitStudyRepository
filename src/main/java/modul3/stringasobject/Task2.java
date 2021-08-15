package modul3.stringasobject;
/*
2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "a  aba ccc aaa bca";
        System.out.println("Исходная строка: ");
        System.out.println(str + "\n");
        str = str.replace("a", "ab");
        System.out.println("Преобразованная строка:");
        System.out.println(str);
    }
}
