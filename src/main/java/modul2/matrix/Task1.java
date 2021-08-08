package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {
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
        System.out.println("Все нечетные столбцы, у которых первый элемент больше последнего:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if((j + 1) % 2 != 0 && matrix[0][j] > matrix[n-1][j]) System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
