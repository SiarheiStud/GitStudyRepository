package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
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

        // Sort column ascending
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                int tempValue = matrix[j][i];
                int k = j-1;
                while (k >= 0 && tempValue < matrix[k][i]){
                    matrix[k + 1][i] = matrix[k][i];
                    k--;
                }
                matrix[k + 1][i] = tempValue;
            }
        }
        System.out.println("Столбцы матрицы отсортированны по возрастанию:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        // descending column sort
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                int tempValue = matrix[j][i];
                int k = j-1;
                while (k >= 0 && tempValue > matrix[k][i]){
                    matrix[k + 1][i] = matrix[k][i];
                    k--;
                }
                matrix[k + 1][i] = tempValue;
            }
        }
        System.out.println("Столбцы матрицы отсортированны по убыванию:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
