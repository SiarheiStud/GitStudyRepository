package modul3.stringasarray;

import java.util.Arrays;
/*
1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1 {

    public static String stringInSnakeCase(String str){ //transform the string to snake_case
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (Character.isUpperCase(ch)) // check the uppercase character
                str = str.replace(Character.toString(ch) , "_" + Character.toLowerCase(ch));
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strArray = {"intNumber", "doubleMaxValue", "differentSomethingElement",
                "elseRandomInputMessageFromHead", "abc", "buildingOfCarFactory"};
        System.out.println("Исходный массив названий переменных: " + Arrays.toString(strArray));
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = stringInSnakeCase(strArray[i]);
            }
        System.out.println("Преобразованный массив названий переменных: " + Arrays.toString(strArray));
        }
}
