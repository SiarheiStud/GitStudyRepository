package modul2.matrix;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,2n  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
            8  1  6
            3  5  7
            4  9  2
 */
public class Task16 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int count = 1;
        int i = 0;
        int j = matrix.length/2;
        while (count != n * n + 1){
            matrix[i][j] = count;

            count++;
            if (((i == 0) && (j >= n-1)) && (matrix[n-1][0] != 0)){
                i++;
            }
            else {
                i--;
                if (i < 0) {
                    i = n - 1;
                }
                j++;
                if (j == n) {
                    j = 0;
                }
                if(matrix[i][j]!=0){
                    i+=2;
                    j--;
                }
            }
        }
        System.out.println("Магический квадрат: ");
        for(i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
