package basics;

public class Arrays {
    public static void main(String[] args) {

        // various declaration & initialization of an array
        int[] myArray = new int [4];
        myArray[0] = 7;
        myArray[1] = 14;
        myArray[2] = 21;
        myArray[3] = 28;
        // print array with for-each
        for(int i = 0; i<4; i++) {
            System.out.println(myArray[i]);
        }

        // various declaration & initialization of an array
        int [] myArray2 = new int [] {7,14,21,28};
        for(int i = 0; i<4; i++)
            System.out.println(myArray2[i]);

        // various declaration & initialization of an array
        int [] myArray3 = {7,14,21,28};
        for(int i = 0; i<4; i++)
            System.out.println(myArray3[i]);

        // various declaration & initialization of an array
        // new array
        int[] myArray1 = new int [100];
        // array cu primele x numere multiplu de 7
        for(int i=0; i<myArray1.length; i++) {
            myArray1 [i] = (i + 1) * 7;
        }
        for(int i = 0; i < myArray1.length; i++)  // myArray.length !!!
            if (i % 2 == 1) { // afiseaza numai cele pare
                i = i++; // ma asigur sa nu am valoare negativa la array
                System.out.println(myArray1[i]);
            }

        // array of arrays
        char [][] myMatrix = {{'&','$','*'}, {'a','b','c'}, {'1','2','3'},
        };
        for (int row = 0; row < myMatrix.length; row++) {
            for(int col = 0; col < myMatrix[row].length; col++) {
                System.out.print(myMatrix[row][col]); //row si col vs col si row - de incercat acasa
                System.out.print(" ");
            }
            System.out.println();
        }

        // sortarea numerelor din array
        byte [] myArray4 = {7,21,14,28};
        java.util.Arrays.sort(myArray4);
    }
}
