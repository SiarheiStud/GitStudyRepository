package modul2.decomposition;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
/*
11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static int getCountDigits(double a){
        if (a == 0) return 1;
        BigDecimal bD = BigDecimal.valueOf(a).abs(); //  use BigDecimal, since double values do not work stably
        double fractional = Math.abs(a - (int)a); // fractional part of a number
        while (fractional > 0){  // convert to integer
            bD = bD.movePointRight(1);
            BigDecimal tempBD = bD.setScale(0, RoundingMode.valueOf(1));
            tempBD = bD.subtract(tempBD);
            fractional = tempBD.doubleValue();
        }
        int intA = bD.intValue();

        int countDigits = 0;
        while (intA > 0){
            countDigits++;
            intA /= 10;
        }
        return countDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble(); // enter the number
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble(); // enter the number
        int digitA = getCountDigits(a);
        System.out.println("В первом числе количество цифр: " + digitA);
        int digitB = getCountDigits(b);
        System.out.println("Во втором числе количество цифр: " + digitB);

        if (digitA == digitB) System.out.println("В числах одинаковое количество цифр.");
        else if (digitA > digitB) System.out.println("В первом числе больше цифр.");
        else System.out.println("Во втором числе больше цифр.");
        scanner.close();
    }
}
