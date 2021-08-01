package Modul1.сycles;

import java.math.BigInteger;

/*
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task4 {
    public static void main(String[] args) {

        BigInteger mult = new BigInteger("1"); //keeps the result of multiplication (primitive types  not enough  to contain the number)

        for(int i = 1 ; i <= 200; i++){
            mult = mult.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println("Произведение квадратов первых двухсот чисел: " + mult);
    }
}
