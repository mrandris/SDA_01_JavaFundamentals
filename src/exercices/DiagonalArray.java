package exercices;

public class DiagonalArray {
    //    adunam valoarea elementelor in diagonala a unei matrice
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 11}
        };

        int sum_pr = 0;
        int sum_sec = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum_pr += matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    sum_sec += matrix[i][j];
                }
            }
        }

        System.out.println(sum_pr);
        System.out.println(sum_sec);

        int x = Math.abs(sum_pr - sum_sec);
        System.out.println(x);
    }
}
