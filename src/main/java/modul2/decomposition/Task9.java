package modul2.decomposition;

import java.util.Scanner;
/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.

Для того, чтобы четырехугольник существовал, необходимо, чтобы длина одной из его сторон была меньше,
чем сумма длин трех остальных сторон
Площадь треугольника равна корню из произведения разностей полупериметра
треугольника и каждой из его сторон на полупериметр:
 */
public class Task9 {
    public static double calcArea (int x, int y, int z, int t){
        double gip = Math.sqrt(x * x + y * y); // length of the hypotenuse
        double area1 = x * y * 0.5; // area of a right triangle
        double p = (z + t + gip) * 0.5; //semi-perimeter
        double area2 = Math.sqrt(p * (p - z) * (p - t) * (p - gip)); // area second triangle
        return area1 + area2; // area of a quadrilateral
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой стороны:");
        int x = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите длину второй стороны:");
        int y = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите длину третьей стороны:");
        int z = MyMethods.getNaturalNumber(scanner);
        System.out.println("Введите длину четвёртой стороны:");
        int t = MyMethods.getNaturalNumber(scanner);
        if(x > y + z + t || y > x + z + t || z > x + y + t || t > x + y + z) System.out.println("Такой " +
                "четырёхугольник не существет");
        else System.out.printf("Площадь четырёхугольника: %.2f", calcArea(x, y, z, t));
        scanner.close();
    }
}
