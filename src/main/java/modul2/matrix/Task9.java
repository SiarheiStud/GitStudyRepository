package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
9.  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Task9 {
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
        int sum = 0;
        int maxSum = 0; //contains the maximum sum of the elements of the column
        int maxColumn = 0; //contains the index of the column with maximum sum of the elements

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                sum = sum + matrix[j][i];
            }
            System.out.println("Сумма элементов " + (i + 1) + "-го столбца = " + sum);
            if (sum > maxSum){
                maxSum = sum;
                maxColumn = i;
            }
            sum = 0;
        }
        System.out.println((maxColumn + 1)+ "-й столбец содержит максимальную сумму равную:" + maxSum);
        scanner.close();
    }
}
