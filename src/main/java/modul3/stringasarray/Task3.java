package modul3.stringasarray;
/*
3. В строке найти количество цифр.
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "123 word5 0 , word11.33 + digits_693";
        char[] charArray = str.toCharArray();
        int countDigits = 0;
        for (char ch : charArray) {
            if(ch >= '0' && ch <= '9') countDigits++;
        }
        System.out.println("Количество цифр в строке: " + countDigits);
    }
}
