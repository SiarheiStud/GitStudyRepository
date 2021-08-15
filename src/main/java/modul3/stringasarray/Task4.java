package modul3.stringasarray;
/*
4. В строке найти количество чисел.
 */
public class Task4 {

    public static int countNumberInString(String str){
        char[] charArray = str.toCharArray();
        int countNumber = 0;
        boolean isFloat = false; //true if find float or double value
        for (int i = 1; i < charArray.length; i++) {
            if (i == charArray.length - 1 && Character.isDigit(charArray[i])) countNumber++; // if end of line
            else if (charArray[i] == '.' && Character.isDigit(charArray[i - 1]) && i + 1 < charArray.length && Character.isDigit(charArray[i + 1])) {
                isFloat = true; // find float value
            } else if (isFloat && !Character.isDigit(charArray[i])){ // if find float or double value
                countNumber++;
                isFloat = false;
            } else if (Character.isDigit(charArray[i - 1]) && !Character.isDigit(charArray[i])  && !isFloat) countNumber++;
        }
        return countNumber;
    }

    public static void main(String[] args) {
        String str = "123 word5 0 , word11.33 + digits_693";
        int countNumber; // number of numbers in a line
        if (str == null) System.out.println("Строка не должна быть null:");
        else if (str.equals("")) System.out.println("Пустая строка.");
        else{
            countNumber = countNumberInString(str);
            System.out.println("Исходная строка:");
            System.out.println(str);
            System.out.println("Количество чисел в строке: " + countNumber);
        }
    }
}
