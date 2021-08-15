package modul3.stringasobject;
/*
3. Проверить, является ли заданное слово палиндромом.
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "   abcKkcBa ";
        System.out.println("Исходное слово: ");
        str = str.trim();
        System.out.println(str);
        if(str.indexOf(' ') != -1) System.out.println("введено больше чем одно слово!");
        else{
            StringBuilder sB = new StringBuilder(str).reverse();
            if(str.equalsIgnoreCase(sB.toString())) System.out.println("Слово является палиндромом.");
            else System.out.println("Слово не является палиндромом.");
        }
    }
}

