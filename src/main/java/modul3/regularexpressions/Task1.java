package modul3.regularexpressions;

import java.util.Arrays;
import java.util.Scanner;
/*
1. Создать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом
три  различных операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать
слова  по  длине; отсортировать лексемы в предложении  по убыванию количества вхождений заданного символа,
а в случае равенства – по алфавиту.
 */
public class Task1 {

    public static void printMenu(){ // show action selection menu
        System.out.println("Меню программы:");
        System.out.println("1. Отсортировать абзацы по количеству предложений;");
        System.out.println("2. В каждом предложении отсортировать слова по длине;");
        System.out.println("3. Отсортировать лексемы в предложении по убыванию количества вхождений заданного " +
                "символа, а в случае равенства – по алфавиту;");
        System.out.println("4. Отобразить исходный текст;");
        System.out.println("0. Выход.");
        System.out.println("\nВыберите пункт меню:");
    }

    public static int selectMenuItem(Scanner scanner) { // select menu item
        boolean isCorrect; // true if the input number is correct
        String inputText; // input value
        do{
            isCorrect = true; // true if the input number is correct
            printMenu(); // show action selection menu
            inputText = scanner.nextLine();
            inputText = inputText.trim();
            if (inputText.equals("") || inputText.length() != 1 || !Character.isDigit(inputText.charAt(0))){
                System.out.println("\nВведены не корректные данные. Повторите выбор пункта.\n");
                isCorrect = false;
            } else if (Integer.parseInt(inputText) < 0 || Integer.parseInt(inputText) > 4){
                System.out.println("\nВыбранного пункта нет в меню. Повторите выбор пункта.\n");
                isCorrect = false;
            }
        }while (!isCorrect);
        return Integer.parseInt(inputText);
    }

    public static int continueProgramMenu(Scanner scanner){ // request, after executing a program item
        boolean isCorrect; // true if the input number is correct
        String inputText; // input value
        do{
            isCorrect = true; // true if the input number is correct
            System.out.println("\nПродолжить выполнение программы?");
            System.out.println("1. Да");
            System.out.println("0. Выход");
            inputText = scanner.nextLine();
            inputText = inputText.trim();
            if (inputText.equals("") || inputText.length() != 1 || !Character.isDigit(inputText.charAt(0))){
                System.out.println("\nВведены не корректные данные. Повторите выбор пункта.\n");
                isCorrect = false;
            } else if (Integer.parseInt(inputText) < 0 || Integer.parseInt(inputText) > 1){
                System.out.println("\nВыбранного пункта нет в меню. Повторите выбор пункта.\n");
                isCorrect = false;
            }
        }while (!isCorrect);
        return Integer.parseInt(inputText);
    }

    public static String[][] textIntoSentences(String text){ // breaking text into sentences
        String[] paragraphArray = text.trim().split("\\s*\\n\\s*"); // breaking text into paragraphs
        String[][] sentencesArray = new String[paragraphArray.length][]; // array of sentences
        for (int i = 0; i < paragraphArray.length; i++) {
            sentencesArray[i] = paragraphArray[i].trim().split("\\s*[.!?]+\\s*");//breaking a paragraph into lines
        }
        return sentencesArray;
    }

    public static void sortParagraphsBySentences(String[][] sentencesArray, String text) { // sort paragraphs by number of sentences
        System.out.println("Выбран пункт 1. Отсортировать абзацы по количеству предложений.");
        String[] paragraphArray = text.trim().split("\\s*\\n\\s*"); // breaking text into paragraphs
        for (int i = 1; i < sentencesArray.length; i++) {  //Sort the paragraphs by number of sentences
            int currentLength = sentencesArray[i].length; // sentencesArray[i] contains array of sentences
            String[] tempString = sentencesArray[i];
            String tempParagraph = paragraphArray[i];
            int j = i;
            while(j > 0 && currentLength < sentencesArray[j - 1].length)  {
                sentencesArray[j] = sentencesArray[j - 1];
                paragraphArray[j] = paragraphArray[j-1]; // shift the paragraph of text
                j--;
            }
            sentencesArray[j] = tempString;
            paragraphArray[j] = tempParagraph;
        }
        System.out.println("\nАбзацы отсортированы по количеству предложений:\n");
        for (String paragraph : paragraphArray) {
            System.out.println(paragraph);
        }
    }

    public static void sortByWordLength(String[] wordArray){ // sorts words by length in a sentence
        for (int i = 1; i < wordArray.length ; i++) {
            String tempStr = wordArray[i]; // tempStr contains current word
            int currentLength = wordArray[i].length(); // length of current word
            int j = i;
            while(j > 0 && currentLength < wordArray[j - 1].length()){
                wordArray[j] = wordArray[j - 1];
                j--;
            }
            wordArray[j] = tempStr;
        }
    }

    public static void sortSentencesByWordLength(String text){
        System.out.println("Выбран пункт 2. В каждом предложении отсортировать слова по длине.");
        StringBuilder strBuild = new StringBuilder(); // contains sorted sentences of paragraph
        String[] paragraphArray = text.trim().split("\\s*\\n\\s*"); // breaking text into paragraphs
        for (String paragraph: paragraphArray){ // we work with each paragraph separately
            int indexStartSentence = 0; // sentence start index
            int indexEndSentence; // sentence end index
            String tempStr; // contains a sorted sentence
            for (int i = 0; i < paragraph.length(); i++) {
                if (paragraph.charAt(i) == '.' || paragraph.charAt(i) == '!' || paragraph.charAt(i) == '?'){
                    indexEndSentence = i; // sentence end index
                    tempStr = paragraph.substring(indexStartSentence, indexEndSentence);
                    String[] wordArray = tempStr.trim().split("[,:;^()\"'%-]*\\s+"); // breaking sentence into words
                    sortByWordLength(wordArray); // sort sentences by word length
                    tempStr = String.join(" ", wordArray); // make a sentence out of words
                    strBuild.append(tempStr).append(paragraph.charAt(i)); // add a line and a sentence end sign
                    if(i != paragraph.length() - 1) strBuild.append(" ");
                    do{ // if at the end of a sentence there are several "." "!" "?" then skip them
                        i++;
                    }while(i < paragraph.length() && !Character.isLetterOrDigit(paragraph.charAt(i)));
                    indexStartSentence = i;
                }
            }
            System.out.println(strBuild);
            strBuild.delete(0,strBuild.length());
        }
    }

    public static char insertSymbol(Scanner scanner) { // enter symbol
        System.out.println("Введите символ:");
        String inputText; // input value
        boolean isCorrect; // true if the input value is correct
        do{
            isCorrect = true; // true if the input number is correct
            inputText = scanner.nextLine();
            inputText = inputText.trim();
            if (inputText.equals("") || inputText.length() != 1 ){
                System.out.println("\nВведены не корректные данные. Введите символ:\n");
                isCorrect = false;
            }
        }while (!isCorrect);
        return inputText.charAt(0);
    }

    public static String sortWord(String tempStr, char symbol){ // sorting words in a sentence by the count of enter symbol

        String[] wordArray = tempStr.trim().split("\\s*,*\\s+"); // breaking sentence into words
        StringBuilder srtBuild = new StringBuilder(); // will contain the sorted string
        int maxNumberOFSymbol = 0; // max find number of symbol in a word
        for (int i = 0; i < wordArray.length ; i++) {
            int indexSymbol;
            int indexFind = 0; // search start index
            int countSymbol = 0; // number of symbol in a word
            do{ // finds for the number of symbol in each word
                indexSymbol = wordArray[i].indexOf(symbol, indexFind);
                if(indexSymbol != -1){
                    countSymbol++;
                    indexFind = indexSymbol + 1;
                    if(maxNumberOFSymbol < countSymbol) maxNumberOFSymbol = countSymbol;
                }
            } while(indexSymbol != -1 && indexFind < wordArray[i].length());
            wordArray[i] = countSymbol + wordArray[i]; //at the beginning of each word, add the number of found symbol
        }
        Arrays.sort(wordArray, String.CASE_INSENSITIVE_ORDER); //sort the array case-insensitively(ignore case)
        tempStr = String.join(" ", wordArray); // make a sentence out of words
        for (int i = maxNumberOFSymbol; i >= 0 ; i--) { // the words with the maximum occurrence of the symbol are shift to the beginning of the line
            String regex = "\\s*" + i;
            String[] sortWordArray = tempStr.trim().split(regex); // breaking sentence into words
            for (int j = 1; j < sortWordArray.length ; j++) {
                srtBuild.append(sortWordArray[j]).append(" ");
            }
            tempStr = sortWordArray[0];
        }
        return srtBuild.toString().trim();
    }

    public static void sortWordByCountSymbol(String text , char symbol) {
        System.out.println("Выбран пункт 3. Отсортировать лексемы в предложении по убыванию количества " +
                "вхождений заданного символа, а в случае равенства – по алфавиту.");
        StringBuilder strBuild = new StringBuilder(); // contains sorted sentences of paragraph
        String[] paragraphArray = text.trim().split("\\s*\\n\\s*"); // breaking text into paragraphs
        for (String paragraph: paragraphArray){ // we work with each paragraph separately
            int indexStartSentence = 0; // sentence start index
            int indexEndSentence; // sentence end index
            String tempStr; // contains a one sentence of paragraph
            for (int i = 0; i < paragraph.length(); i++) {
                if (paragraph.charAt(i) == '.' || paragraph.charAt(i) == '!' || paragraph.charAt(i) == '?'){
                    indexEndSentence = i; // sentence end index
                    tempStr = paragraph.substring(indexStartSentence, indexEndSentence);
                    tempStr = sortWord(tempStr, symbol); // sorted current sentence
                    strBuild.append(tempStr).append(paragraph.charAt(i)); // add a line and a sentence end sign
                    if(i != paragraph.length() - 1) strBuild.append(" ");
                    do{ // if at the end of a sentence there are several "." "!" "?" then skip them
                        i++;
                    }while(i < paragraph.length() && !Character.isLetterOrDigit(paragraph.charAt(i)));
                    indexStartSentence = i;
                }
            }
            System.out.println(strBuild);
            strBuild.delete(0,strBuild.length());
        }
    }

    public static void main(String[] args) {
        String text = "Тема государственного долга довольно часто поднимается представителями СМИ, политическими партиями, государственными органами. Госдолг воспринимается, как что-то крайне неправильное, особенно, если речь идет о госдолге перед внешними кредиторами.\n" +
                "Государственный долг - это сумма полученных и непогашенных государственных займов, а также долговых обязательств. Иными словами, государственный долг формируется из долга правительства, НБ и местных исполнительных органов. Государственный долг может быть внутренним и внешним.\n" +
                "Внешний государственный долг - это все обязательства государства перед иностранными государствами, гражданами, юридическими лицами и международными организациями. \n" +
                "Внутренний государственный долг - это обязательства государства перед своими гражданами и юридическими лицами.\n" +
                "Основная доля госдолга формируется за счет заимствований правительства. Мы с вами уже знаем, когда запланированные расходы государства превышают запланированные доходы, мы имеем дело с дефицитом государственного бюджета. Но государство не может просто так взять и вычеркнуть расходы. После принятия бюджета для покрытия сформировавшегося дефицита правительство чаще всего вынуждено привлекать дополнительные источники финансирования. Самым оперативным решением является привлечение заемных средств.\n";


        Scanner scanner = new Scanner(System.in);
        int menuItem = selectMenuItem(scanner); // selected menu item
        while (menuItem != -1){
            switch (menuItem){
                case 0:
                    System.out.println("Выход из программы.");
                    menuItem = -1;
                    break;
                case 1:
                    String[][] sentencesArray = textIntoSentences(text); // array of sentences
                    sortParagraphsBySentences(sentencesArray, text); // sort paragraphs by number of sentences
                    menuItem = continueProgramMenu(scanner); // selected menu continue program
                    if (menuItem != 0) menuItem = selectMenuItem(scanner); // selected menu item
                    break;
                case 2:
                    sortSentencesByWordLength(text);// sort sentences by word length
                    menuItem = continueProgramMenu(scanner); // selected menu continue program
                    if (menuItem != 0) menuItem = selectMenuItem(scanner); // selected menu item
                    break;
                case 3:
                    char symbol = insertSymbol(scanner); // enter the symbol
                    sortWordByCountSymbol(text, symbol); // doing task
                    menuItem = continueProgramMenu(scanner); // selected menu continue program
                    if (menuItem != 0) menuItem = selectMenuItem(scanner); // selected menu item
                    break;
                case 4:
                    System.out.println(text);
                    menuItem = continueProgramMenu(scanner); // selected menu continue program
                    if (menuItem != 0) menuItem = selectMenuItem(scanner); // selected menu item
                    break;
            }
        }
        scanner.close();
    }
}
