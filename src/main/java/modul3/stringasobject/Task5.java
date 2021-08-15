package modul3.stringasobject;
/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "It is important that we regularly review what we are doing.";
        int countA = 0; // number of letters 'a' in a line
        int indexA = -1; // index of letters 'a'
        do {
            indexA = str.indexOf('a', indexA + 1);
            if (indexA != -1) countA++;
        } while (indexA != -1);
        System.out.println("Количество найденных букв 'a' в строке: " + countA);
    }
}
