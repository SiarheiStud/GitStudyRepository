package Modul1.linearProgramm;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.

 */
public class Task4 {
    public static void main(String[] args) {
        double r;
        double result; //result number

        r = 123.789;
        result = r * 1000 % 1000.0 + (int)r / 1000.0;
        System.out.println("Полученное число: " + result);
    }
}
