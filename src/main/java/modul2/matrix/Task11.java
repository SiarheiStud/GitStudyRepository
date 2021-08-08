package modul2.matrix;

import java.util.Random;
/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];

        //************************************************************
        //                     fill the matrix
        Random random = new Random();
        System.out.println("Исходная матрица: ");
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                matrix[i][j] = random.nextInt(16);
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Номера строк, в которых число 5 встречается три и более раз:");
        int count = 0;
        boolean key = true; // true if found so row
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if(matrix[i][j] == 5) count++;
                if (count == 3) {
                    System.out.print((i+1) + "  ");
                    key = false;
                    break;
                }
            }
            count = 0;
        }
        if (key) System.out.println("Такие строки отсутствуют.");
    }
}
