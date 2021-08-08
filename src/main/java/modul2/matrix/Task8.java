package modul2.matrix;

import java.util.Random;
import java.util.Scanner;
/*
8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class Task8 {
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

        //               Enter the number 1-st column
        System.out.println("Введите номер 1-го столбца (от 1 до " + n + "):");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp || temp > n){
            System.out.println("Введено не корректное число (не может быть больше размерности матрицы,  " +
                    "отрицательным, дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int column1 = (int) temp;

        //               Enter the number second column
        System.out.println("Введите номер 2-го столбца (от 1 до " + n + "):");
        temp = scanner.nextDouble(); // use double since a human can enter not an integer
        while (temp <= 0 || temp != (int)temp || temp > n){
            System.out.println("Введено не корректное число (не может быть больше размерности матрицы,  " +
                    "отрицательным, дробным, либо равным 0 )");
            temp = scanner.nextDouble();
        }
        int column2= (int) temp;

        // resulting matrix
        System.out.println("Матрица в нужном формате:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == column1 - 1) System.out.print(matrix[i][column2 - 1] + "  ");
                else if (j == column2 - 1) System.out.print(matrix[i][column1 - 1] + "  ");
                else System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
