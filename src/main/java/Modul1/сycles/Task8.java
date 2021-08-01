package Modul1.сycles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
(как я понял , надо решить задачу без использования массивов , строк итд)
 */
public class Task8 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        b = scanner.nextDouble();

        //  use BigDecimal, since double values do not work stably
        BigDecimal bigD;
        BigDecimal bigDTemp;
        bigD = BigDecimal.valueOf(a).abs();
        double drob = Math.abs(a - (int) a);
        while (drob > 0){ // convert the entered number "a" to an long
            bigD = bigD.movePointRight(1);
            //bigDTemp = bigD.setScale(0, 1);
            bigDTemp = bigD.setScale(0, RoundingMode.valueOf(1));
            bigDTemp = bigD.subtract(bigDTemp);
            drob = bigDTemp.doubleValue();
        }
        if (Math.abs(a) > 0 && (int) a == 0)
            bigD = bigD.multiply(BigDecimal.valueOf(10)); //add the digit 0 if the number "a" starts with 0 (for example 0.1654)

        long longA = bigD.longValue(); //got a long consisting of all digits of the entered number
                                        // use long since large values can be entered
        drob = Math.abs(b - (int) b);
        bigD = BigDecimal.valueOf(b).abs();
        while (drob > 0){ // convert the entered number "b" to an long
            bigD = bigD.movePointRight(1);
            //bigDTemp = bigD.setScale(0, 1);
            bigDTemp = bigD.setScale(0, RoundingMode.valueOf(1));
            bigDTemp = bigD.subtract(bigDTemp);
            drob = bigDTemp.doubleValue();
        }
        if (Math.abs(b) > 0 && (int) b == 0) bigD = bigD.multiply(BigDecimal.valueOf(10)); //add the digit 0 if the number "b" starts with 0 (for example 0.1654)
        long longB = bigD.longValue();

        //Main part of the program: finding common numbers
        System.out.print("Цифры входящии в состав обоих чисел: ");

        for(int i =0; i < 10; i++){
            boolean key = false; // true if digit "i" is found
            long tempLongA = longA; // tempIntA contains the number "a", with which we will doing out operations
            long tempLongB=  longB; // tempIntB contains the number "b", with which we will doing out operations
            if (i == 0 && a == 0) key = true; // condition when the number "a" = 0, we are find digit 0 in the number "b"

            while(tempLongA !=0) {
                long tempA = tempLongA % 10; //select the digit for compare
                if (tempA == i) {
                    key = true;
                    break;
                }
                if (tempA == i && b == 0 ){ // condition when the number "b" = 0, we are find digit 0 in the number "a"
                    System.out.print(0 + "  ");
                    break;
                }
                tempLongA /= 10;
            }
            if(key){ // If "i" is found in the 1st number, then we are looking for it in the 2nd number
                if (i == 0 && b == 0 ){ // we get here when the number b = 0, and in the number "a" there is a digit 0
                    System.out.print(0 + "  ");
                }
                while(tempLongB !=0){
                    long tempB = tempLongB % 10; //select the digit for compare
                    if (tempB == i){
                        System.out.print(i + "  ");
                        break;
                    }
                    tempLongB /= 10;
                }
            }
        }
    }
}
