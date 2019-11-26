package basics;

public class Loops {
    public static void main(String[] args) {

        // for loop
        for(int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        // while loop
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        x = 1; // reset x la 1, altfel ar porni de la 10 din while loop

        // do while
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        //for each
        int [] myArray = {7,14,21,28};
        for(int i : myArray) {
            System.out.println(i);
        }
    }
}
