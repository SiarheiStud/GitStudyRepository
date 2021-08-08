package modul2.matrix;

import java.util.Scanner;
/*
4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        1    2    3    ...    n
        n   n-1  n-2   ...    1
        1    2    3    ...    n
        n   n-1  n-2   ...    1
        .    .    .    .      .
        .    .    .     .     .
        .    .    .      .    .
        n   n-1  n-2   ...    1

 */
public class Task4 {
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
        System.out.println("Полученная матрица:");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i % 2 == 0) {
                    System.out.print(j + 1 + "  ");
                }else System.out.print(n - j + "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
