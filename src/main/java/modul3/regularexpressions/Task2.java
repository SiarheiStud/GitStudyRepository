package modul3.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2.  Дана строка, содержащая следующий текст (xml-документ):

<notes>
   <note id = "1">
       <to>Вася</to>
       <from>Света</from>
       <heading>Напоминание</heading>
       <body>Позвони мне завтра!</body>
   </note>
   <note id = "2">
       <to>Петя</to>
       <from>Маша</from>
       <heading>Важное напоминание</heading>
       <body/>
   </note>
</notes>

Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип  (открывающий
тег,  закрывающий  тег,  содержимое  тега,  тег  без  тела).  Пользоваться  готовыми  парсерами XML  для  решения  данной  задачи
нельзя.
 */
public class Task2 {

    public static  String parserXML(String text){ // analysis the text
        StringBuilder strBuild = new StringBuilder();
        String[] lineOfTextXML = text.split("\\n"); // array of xml text lines
        Pattern startTag = Pattern.compile("<\\w+>");
        Pattern startTagWithAttribute = Pattern.compile("<\\w+.*\">");
        Pattern content = Pattern.compile(">.+<");
        Pattern selfClosingTag = Pattern.compile("<\\w+/>");
        Pattern endTag = Pattern.compile("</\\w+>");

        for (int i = 0; i < lineOfTextXML.length; i++) {
            lineOfTextXML[i] = lineOfTextXML[i].trim();

            Matcher matStartTag = startTag.matcher(lineOfTextXML[i]); // find start tag
            if(matStartTag.find()){
                strBuild.append(matStartTag.group()).append("   Open tag\n");
            }

            Matcher matStartTagWithAttribute = startTagWithAttribute.matcher(lineOfTextXML[i]); // find star tag with attribute
            if(matStartTagWithAttribute.find()){
                strBuild.append(matStartTagWithAttribute.group()).append("   Start tag with attribute\n");
            }

            Matcher matContent = content.matcher(lineOfTextXML[i]); // find content
            if(matContent.find()){
                //strBuild.append(matStartTag.group()).append("   Open tag\n");
                strBuild.append(matContent.group(), 1, matContent.group().length() - 1).append("   Content\n");
            }

            Matcher matSelfClosingTag = selfClosingTag.matcher(lineOfTextXML[i]); // find self-closing tag
            if(matSelfClosingTag.find()){
                strBuild.append(matSelfClosingTag.group()).append("   Self-closing tag\n");
            }

            Matcher matEndTag = endTag.matcher(lineOfTextXML[i]); // find end tag
            if(matEndTag.find()){
                strBuild.append(matEndTag.group()).append("   End tag\n");
            }
        }
        return strBuild.toString();
    }

    public static void main(String[] args) {
        String textXML = "<notes>\n" +
                         "  <note id = \"1\">\n" +
                         "      <to>Вася</to>\n" +
                         "      <from>Света</from>\n" +
                         "      <heading>Напоминание</heading>\n" +
                         "      <body>Позвони мне завтра!</body>\n" +
                         "  </note>\n" +
                         "  <note id = \"2\">\n" +
                         "      <to>Петя</to>\n" +
                         "      <from>Маша</from>\n" +
                         "      <heading>Важное напоминание</heading>\n" +
                         "      <body/>\n" +
                         "  </note>\n" +
                         "</notes>";
        String result = parserXML(textXML);
        System.out.println("Содержимое и тип узлов xml-документа:\n" + result);
    }
}
