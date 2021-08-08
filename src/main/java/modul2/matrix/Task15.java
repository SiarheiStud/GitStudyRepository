package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
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
        int maxValue = matrix[0][0];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(matrix[i][j] > maxValue) maxValue = matrix[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(matrix[i][j] % 2 != 0) matrix[i][j] = maxValue;
            }
        }
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Полученная матрица:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
