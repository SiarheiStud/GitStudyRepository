package modul3.stringasarray;
/*
2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "word Word woRd aworda letter letwordter wword letterwordletter word wor";
        if (str == null) System.out.println("Необходимо ввести строку.");
        else{
            System.out.println("Исходная строка: ");
            System.out.println(str);
            char[] charArray = str.toCharArray();
            char[] charLetter = {'l', 'e', 't', 't', 'e', 'r'};
            int countWard = 0; // number of occurrences "word" in charArray
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == 'w' && i + 4 < charArray.length && str.startsWith("word", i)) {
                    countWard++;
                }
            }
            // the number of elements in a string "letter" is two more elements than in a string "word"
            char[] resultCharArray = new char[charArray.length + 2 * countWard]; // size of the new array
            int j = 0; // contains the index of the resultCharArray element
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == 'w' && i + 4 < charArray.length && str.startsWith("word", i)){
                    for (char ch : charLetter) {
                        resultCharArray[j] = ch;
                        j++;
                    }
                    i += 3; //shift index at the end of "word"
                } else {
                    resultCharArray[j] = charArray[i];
                    j++;
                }
            }
            str = String.valueOf(resultCharArray);
            System.out.println("Строка после преобразования: ");
            System.out.println(str);
        }
    }
}
