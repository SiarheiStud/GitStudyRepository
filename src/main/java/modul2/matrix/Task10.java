package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
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
                matrix[i][j] = (int)(random.nextInt(100) * Math.pow(-1, random.nextInt(2) + 1));
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        //************************************************************
        //                main block of the program
        System.out.println("Положительные элементы главной диагонали матрицы:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i == j && matrix[i][j] > 0) System.out.print(matrix[i][j] + "  ");
            }
        }
        scanner.close();
    }
}
