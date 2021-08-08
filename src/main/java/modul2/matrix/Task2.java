package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
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
        System.out.println("Элементы 1-й диагонали:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (i == j) System.out.print(matrix[i][j] + "  ");
            }
        }
        System.out.println();
        System.out.println("Элементы 2-й диагонали:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(j == n -1 - i) System.out.print(matrix[i][j] + "  ");
            }
        }
        scanner.close();
    }
}
