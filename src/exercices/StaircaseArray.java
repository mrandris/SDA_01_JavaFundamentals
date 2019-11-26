package exercices;

public class StaircaseArray {
    // desenam o scara
    public static void main(String[] args) {
        int n = 4;

        // asa trebuie!!!
        for (int i = 1; i <= n; i++) {
            int nr_spatii = n - (i);
            for (int j = 0; j < nr_spatii; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < (i); j++) {
                System.out.print('#');
            }
            System.out.println();
        }

        // de rezolvat acasa
        char[][] myArr = new char[n][n]; //declaram array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    myArr[i][j] = '#';
                } else {
                    myArr[i][j] = 'o';
                }
            }
        }

        for (char[] line : myArr) { //printeaza matricea cu for each!
            for (char elem : line) {
                System.out.print(elem);
            }
            System.out.println();
        }
    }
}
