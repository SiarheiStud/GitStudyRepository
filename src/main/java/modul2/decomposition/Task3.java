package modul2.decomposition;

import java.util.Scanner;
/*
3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя  метод  вычисления  площади
треугольника.
Правильный шестиугольник состоит из 6 равносторонних треугольников
Площадь треугольника S = 1/2 a * b * sin(u) = 1/2 a^2*sin(60)

 */
public class Task3 {

    public static double areaTriangle (double a){
        return a * a * Math.sqrt(3)/4;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны:");
        double sideValue = scanner.nextDouble();
        while (sideValue <= 0) {
            System.out.println("Длина не может быть отрицательным ислом");
            sideValue = scanner.nextDouble();
        }
        double areaHexagon = 6 * areaTriangle(sideValue);
        System.out.printf("Площадь  правильного  шестиугольника  со  стороной %.2f  равна: %.3f", sideValue , areaHexagon);
        scanner.close();
    }
}
