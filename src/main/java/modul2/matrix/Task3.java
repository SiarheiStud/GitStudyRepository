package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of matrix size
        System.out.println("Введите размерность матрицы:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введена не корректная размерность матрицы (не может быть отрицательной, " +
                    "дробной, либо равной 0 )");
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[][] matrix = new int[n][n];

        //************************************************************
        //                     fill the matrix
        Random random = new Random();
        System.out.println("Исходная матрица: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = (random.nextInt(10));
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

        //************************************************************
        //                main block of the program

        //               Enter the number K
        System.out.println("Введите номер строки (которую надо вывести на экран) :");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp || temp > n){
            System.out.println("Введено не корректное число (не может быть больше размерности матрицы,  " +
                    "отрицательным, дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int k = (int) temp;

        //               Enter the number P
        System.out.println("Введите номер столбца (который надо вывести на экран) :");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp || temp > n){
            System.out.println("Введено не корректное число (не может быть больше размерности матрицы, " +
                    "отрицательным, дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int p = (int) temp;

        System.out.println("Строка " + k + " матрицы:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (i == k - 1) System.out.print(matrix[i][j] + "  ");
            }
        }
        System.out.println();
        System.out.println("Столбец " + p + " матрицы:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(j == p - 1) System.out.println(matrix[i][j]);
            }
        }
        scanner.close();
    }
}
