package exercices;

public class Functions {
    //  1. Write a function that takes one String argument (a name) and prints a greeting message (ex: “Hello, John!”)
    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    //  2. Write a function that takes one integer argument n and returns the sum of all integers up to n
    public static int suma(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    // Gauss !!!
    public static int sumaGauss(int n) {
        int sum = (1+n)*n/2;
        return sum;
    }

    //  3. Write a function that takes one integer argument n and returns the sum of all integers up to n that are divisible by 3;
    public static int sum_div3(int n) {
        int sum3 = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                sum3 = sum3 + i;
            }
        }
        return sum3;
    }
    // Gauss !!!

    //  4. Change the previous program such that the function takes an extra argument k and returns the sum of all integers up to n that are divisible by k
    public static int sum_div_k(int n, int k) {
        int sum_k = 0;
        for (int i = 0; i <= n; i++) {
            if (i % k == 0) {
                sum_k = sum_k + i;
            }
        }
        return sum_k;
    }
    // Gauss ???

    //  5. Write a function that takes one integer argument n and prints the next n leap years
    public static void leapYear(int n) {
        for (int i = 1999; i <= 1999 + 4 * n; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                System.out.println(i);
            } else if (i % 100 == 0 && i % 400 == 0) {
                System.out.println(i);
            }
        }
    }
    // Optimize !!!

    //  6. Write a function that takes an array of integers as argument and returns the biggest of them all
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
//        System.out.println("max = " + max);
        return max;
    }

    //  7. Write a function that takes an array of integers as argument and returns the smallest of them all
    public static int minArray(int[] arr1) {
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min >= arr1[i]) {
                min = arr1[i];
            }
        }
//        System.out.println("max = " + max);
        return min;
    }

    //  8. Write a function that takes an array of integers and another integer n as argument and returns true if n is found in that array, false otherwise
    public static boolean isItIn(int[] arr2, int n) {
        boolean e1 = false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == n) {
                e1 = true;
            }
        }
        return e1;
    }

    //  9. Write a function that takes an integer n as argument and prints the first n numbers in the Fibonacci sequence (1, 1, 2, 3, 5, 8, etc..)
    public static void printFibonacci(int n) {
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < n; i++) {
//            System.out.println("F(i-2)= " + fibonacci[i-2]);
//            System.out.println("F(i-1)= " + fibonacci[i-1]);
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
//            System.out.println("F(i)= " + fibonacci[i]);
        }

/*        for (int j : fibonacci) {
            int i = 0;
            i=i+1;
            System.out.println("F("+ i +")=" + j);
        }*/

        for(int i = 0; i<fibonacci.length; i++) {
            System.out.print("i=" + i + " ");
            System.out.println("F("+ i +")=" + fibonacci[i]);
        }
    }
    // printFibonacci2 e mult mai rapid, ca nu tine minte toate valorile arrayului Fibonacci in memorie
    public static void printFibonacci2(int n) {
        int penultim = 0;
        int ultim = 1;
        System.out.println("i=0 F(0)=" + penultim);
        System.out.println("i=1 F(1)=" + ultim);
        for (int i = 2; i < n; i++) {
            int curent = penultim + ultim;
            System.out.print("i=" + i + " ");
            System.out.println("F("+ i +")=" + curent);
            penultim = ultim;
            ultim = curent;
        }
    }

    //  10. Write a function that takes an integer n as argument and returns the sum of its digits
    public static int digitSum(int n) {
        int m = 10;
        int sum = 0;
        while(n/m > 0) {
//            System.out.println("sum=" + sum + " m=" + m + " n=" + n);
            sum = sum + n%m;
            n=n/m;
//            System.out.println("sum=" + sum + " m=" + m + " n=" + n);
        }
        sum = sum + n%m;
        return sum;
    }

    //  11. Write a function that takes a String as argument and returns true if that String is a palindrome or false otherwise
    public static boolean isItPalindrome(String word) {
        char[] word1 = word.toCharArray();
        boolean x = false;
        //abcba

/*        for(int i=0; i < word1.length; i++) {
            System.out.println(word1[i]);
        }*/
        for(int i=0; i < word1.length/2; i++) {
            if (word1[i] == word1[word1.length - 1 - i]) {
                x = true;
                System.out.print("i=" + i + " - ");
                System.out.println(word1[i] + "/" + word1[word1.length - 1 - i]);
            } else {
                x = false;
                System.out.print("i=" + i + " - ");
                System.out.println(word1[i] + "/" + word1[word1.length - 1 - i]);
                break;
            }
        }
        System.out.print("The word '" + word + "' is a palindrome: ");
        return x;
    }

    // 11.1 Print out a string from lft to right then from right to left
    public static void invertedString(String word) {
// transform String to array of chars
        char[] word1 = word.toCharArray(); //
        for (int i = 0; i < word1.length; i++) {
            System.out.print(word1[i]);
        }
        System.out.println(" ");

/*        for (int i = 0; i < word1.length; i++) { // intorc stringul cu StringBuilder :)
            int j = (word1.length - 1 - i);
            System.out.print(word1[j]);
        }*/
// invert the array of chars with stringbuilder
        StringBuilder y = new StringBuilder(word1[word1.length-1]);
        for(int i = word1.length-1; i >=0; i--) {
            y.append(word1[i]);
//            System.out.print(word1[i]);
        }
        System.out.println(y.toString() + " is the new inverted string");
// tell me if it's a palindrome
        if(word.equals(y.toString())) {
            System.out.println(word + " is a palindrome!");
        }
    }

    //  12. Write a function that takes a String as argument and returns true if that String is a number or false otherwise
    public static boolean isItNumber(String word) {
        char[] word1 = word.toCharArray(); // string to array de char
/*
        for (int i = 0; i < word1.length; i++) { // print arrayul de char
            System.out.print(word1[i]);
        }
        System.out.println(" ");
*/
        boolean x = false;

        for (int i = 0; i < word1.length; i++) {
            if (word1[i] >= '0' && word1[i] <= '9') {
                x = true;
                System.out.println(word1[i] + " - number");
            } else {
                x = false;
                System.out.println(word1[i] + " - not a number");
                break;
            }
        }

        if (x == true) { // prints if it is or not a number
            System.out.print("The string '" + word + "' is a number: ");
        } else {
            System.out.print("The string '" + word + "' is a number: ");
        }
        return x;
    }
}
