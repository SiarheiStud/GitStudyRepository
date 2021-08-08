package modul2.decomposition;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
А(x1,y1)
B(x2,y2)
Расстояние между точками = sqrt((x2-x1)^2 + (y2-y1)^2)
 */
public class Task4 {
    public static double calcDistance(int x1, int y1, int x2, int y2 ){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat dF = new DecimalFormat("##.###");
        System.out.println("Введите количество точек:");
        int n = MyMethods.getNaturalNumber(scanner);
        int[] coordArray = new int [n * 2]; // contains coordinates of points coordinates[0] = x1 coordinates[1] = y1

        //************************************************************
        //            form the array
        for (int i = 0; i < coordArray.length ; i++) {
            coordArray[i] = random.nextInt(100);
        }

        //************************************************************
        //                main block of the program
        System.out.println("Массив координат: " + Arrays.toString(coordArray));
        int element1 = 1;
        int element2 = 2;
        double maxDistance = calcDistance(coordArray[0] , coordArray[1], coordArray[2], coordArray[3]);
        int maxDistElement1 = 1;
        int maxDistElement2 = 2;
        for (int i = 0; i < coordArray.length; i += 2) {
            for (int j = i + 2; j < coordArray.length; j += 2) {
                double distance = calcDistance(coordArray[i], coordArray[i + 1], coordArray[j], coordArray[j + 1]);
                System.out.println("Расстояние между " + element1 + "-й и " + element2 + "-й точкой: " + dF.format(distance));
                if (maxDistance < distance){
                    maxDistance = distance;
                    maxDistElement1 = element1;
                    maxDistElement2 = element2;
                }
                element2++;
            }
            element1++;
            element2 = element1 + 1;
        }
        System.out.println("Максимальное расстояние между " + maxDistElement1 + "-й и " + maxDistElement2 + "-й точкой: "
                + dF.format(maxDistance));
        scanner.close();
    }
}
