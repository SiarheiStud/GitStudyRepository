package modul2.matrix;

import java.util.Scanner;
/*
7. Сформировать квадратную матрицу порядка N по правилу:
    A[i,j] = sin((i^2+j^2)/n)
    и подсчитать количество положительных элементов в ней.
 */
public class Task7 {
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

        //************************************************************
        //                main block of the program

        int count = 0; // count positive elements
        double[][] matrix = new double[n][n];
        System.out.println("Полученная матрица:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = Math.sin((Math.pow(i, 2) + Math.pow(j, 2)) / n);
                if(matrix[i][j] > 0) count++;
                System.out.printf("%.2f  ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов в матрице :" + count);
        scanner.close();
    }
}
