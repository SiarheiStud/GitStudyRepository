package modul2.matrix;

import java.util.Scanner;
/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //************************************************************
        //       Enter the number of line in matrix
        System.out.println("Введите количество строк в матрице:");
        double temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp){
            System.out.println("Введено не корректное количество строк (не может быть отрицательным, " +
                    "дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int m = (int) temp;

        //       Enter the number of column in matrix
        System.out.println("Введите количество столбцов в матрице( количество столбцов должно быть меньше либо равно " +
                "количеству строк " + m + "):");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp || temp > m){
            System.out.println("Введено не корректное количество столбцов (не может быть отрицательным, " +
                    "дробным, равным 0). Для возможности выполнения условия задачи число столбцов не должно превышать " +
                    "число " + m);
            temp = scanner.nextDouble();
        }
        int n = (int) temp;
        int[][] matrix = new int[m][n];

        //************************************************************
        //                main block of the program
        int count1 = 0;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (count1 < i + 1){
                    matrix[j][i] = 1;
                    count1++;
                } else matrix[j][i] = 0;
            }
            count1 = 0;
        }
        System.out.println("Полученная матрица:");
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
