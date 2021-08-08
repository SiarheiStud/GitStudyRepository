package modul2.decomposition;

import java.util.Random;
import java.util.Scanner;

public class MyMethods {

    public static int getNaturalNumber(Scanner scanner) { // input number
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int) temp) {
            System.out.println("Введённое число не является натуральным,  число не может быть отрицательным, " +
                    "дробным, либо равным 0");
            temp = scanner.nextDouble();
        }
        return (int) temp;
    }

    public static void fillArray(int[] array){ //filling the array random number
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(random.nextInt(100) * Math.pow(-1, random.nextInt(2) + 1));
        }
    }

}
