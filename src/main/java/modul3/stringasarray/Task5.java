package modul3.stringasarray;
/*
5.  Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы.
Крайние пробелы в строке удалить.
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "    It     is important    that  we regularly review       what we   are doing     ";
        System.out.println("Исходная строка: ");
        System.out.println(str);
        str = str.trim();
        char[] charArray = str.toCharArray();
        char[] resultArray = new char[charArray.length];
        int k = 0; // index of resultArray
        boolean isSpace = false; // true when find ' ' (space);
        for (char ch : charArray) {
            if (ch == ' ' && !isSpace) {
                resultArray[k] = ch;
                k++;
                isSpace = true;
            }
            if (ch != ' ') {
                resultArray[k] = ch;
                k++;
                isSpace = false;
            }
        }
        str = String.valueOf(resultArray).trim();
        System.out.println("Преобразованная строка: ");
        System.out.println(str);
    }
}
