package exercices;

public class Main {
    public static void main(String[] args) {
        // #1 hello + Name
/*
        System.out.println("Problema 1");
        String name = "Gabriel";
        Functions.printName(name);
        System.out.println(" ");
*/
        // #2 prints the sum of integers up to n
/*
        System.out.println("Problema 2");
        int n = 20;
        System.out.println(Functions.suma(n));
        System.out.println("Brute force: " + Functions.suma(20));
        System.out.println("Gauss: " + Functions.sumaGauss(20));
        System.out.println(" ");
*/
        // #3 prints the sum of integers up to n, that are divisible by 3
/*
        System.out.println("Problema 3");
        System.out.println(Functions.sum_div3(20));
        System.out.println(" ");
*/
        // #4 prints the sum of integers up to m, , that are divisible by k
/*
        System.out.println("Problema 4");
        int m = 20; // integers up to 'm'
        int k = 5; // divisible by 'k'
        System.out.println(Functions.sum_div_k(m, k));
        System.out.println(" ");
*/
        // #5 prints the next n leap years
/*
        System.out.println("Problema 5");
        Functions.leapYear(5);
        System.out.println(" ");
*/
        // #6 returns the biggest element of an array of integers
/*
        System.out.println("Problema 6");
        System.out.println(Functions.maxArray(new int[]{9, 3, 200, 58, 13, 24, -3, 56}));
        System.out.println(" ");
*/
        // #7 returns the smallest element of an array of integers
/*
        System.out.println("Problema 7");
        System.out.println(Functions.minArray(new int[]{9, 3, 2, 5, 13, 24, -3, 56}));
        System.out.println(" ");
*/
        // #8 takes an array of integers then takes and tells if an integer is it or not in that array
/*
        System.out.println("Problema 8");
        System.out.println(Functions.isItIn(new int[]{9, 3, 200, 58, 13, 24, -3, 56}, 200));
        System.out.println(" ");
*/
        // #9 prints the first n numbers in the Fibonacci sequence (1, 1, 2, 3, 5, 8, etc..)
        System.out.println("Problema 9");
        Functions.printFibonacci(9);
        System.out.println(" ");

        Functions.printFibonacci2(9); // printFibonacci2 mult mai rapid (=eficient) decat printFibnacci
        System.out.println(" ");
        // #10 returns the sum of a numbers digits
/*
        System.out.println("Problema 10");
        System.out.println(Functions.digitSum(8478239));
        System.out.println(" ");
*/
        // #11 is the String a palindrome?
/*
        System.out.println("Problema 11");
        System.out.print(Functions.isItPalindrome("gezakekazeg"));
        System.out.println(" ");
*/
        // #11.1 Print out a string from right to left + tell if it's a palindrome
/*
        System.out.println("Problema 11.1");
        Functions.invertedString("0123210");
        System.out.println(" ");
*/
        // #12 is the String a number?
/*
        System.out.println("Problema 12");
        System.out.print(Functions.isItNumber("x5a83"));
        System.out.println(" ");
*/
    }
}
