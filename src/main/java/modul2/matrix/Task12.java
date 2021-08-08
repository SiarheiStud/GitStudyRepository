package modul2.matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
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

        // Sort row ascending
        for (int i = 0; i < n; i++){
            Arrays.sort(matrix[i]);
        }
        System.out.println("Строки матрицы отсортированны по возрастанию:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        // descending row sort
        for (int i = 0; i < n; i++){
            Arrays.sort(matrix[i]);
            for(int left = 0 , right = matrix[i].length - 1; left < matrix[i].length / 2; left++, right-- ){
                int tempValue = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tempValue;
            }
        }
        System.out.println("Строки матрицы отсортированны по убыванию:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
