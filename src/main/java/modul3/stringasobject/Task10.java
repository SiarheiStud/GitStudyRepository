package modul3.stringasobject;
/*
10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */
public class Task10 {
    public static void main(String[] args) {
        String str = "   ..It is important. that we.... regularly review????? what we are doing!!    ";
        System.out.println("Исходная строка: ");
        System.out.println(str + "\n");
        int countSentences = 0;
        String[] arrayStr = str.split("[.?!]+");
        for (String element : arrayStr){
            System.out.println(element);
            if(!element.trim().equals("")) countSentences++;
        }
        System.out.println("Количество предложений в строке: " + countSentences);
    }
}
