package modul3.stringasobject;
/*
1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task1 {
    public static void main(String[] args) {
        String str = " It   is  important         that  we regularly review       what we   are doing     ";
        int countSpace = 0; // number of spaces
        int countMaxSpace = 0; // maximum number of spaces
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                countSpace++;
                if(countSpace > countMaxSpace) countMaxSpace = countSpace;
            }else countSpace = 0;
        }
        System.out.println("Исходная строка: ");
        System.out.println(str + "\n");
        System.out.println("Наибольшее количество подряд идущих пробелов в строке: " + countMaxSpace);
    }
}
