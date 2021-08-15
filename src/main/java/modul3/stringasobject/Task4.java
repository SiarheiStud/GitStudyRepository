package modul3.stringasobject;
/*
4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task4 {
    public static void main(String[] args) {
        String str = "информатика";
        String resultStr = str.charAt(7) + str.substring(3, 5) + str.charAt(7);
        System.out.println(resultStr);
    }
}
