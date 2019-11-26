package basics;

import java.util.Date;

public class Strings {
    public static void main(String[] args) {
        String x = "The big brown fox jumps the fence";
        System.out.println(x); //print the String
        System.out.println(x + " in a hurry"); //concatenate strings
        System.out.println("Contains 'brown' : " + x.contains("brown")); //check if String has certain substring
        System.out.println("Contains 'G' : " + x.contains("G")); //check if String has certain substring
        System.out.println(x.replace("big", "small")); //replace substring
        for(String word : x.split(" ")) { //split String into multiple Strings
            System.out.println("Word: " + word);
        }
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());

        /* to play with strings, chars, etc...*/
        /* charAt, toString, split */

        int n = 1000;
        String str1 = "a";
        // vrem sa masuram cat timp ia programului pana termina loopul for
        Date start = new Date(); // marcam timul de inceput
        // un for care ataseaza stringului "a" de n ori
        for(int i = 0; i < n; i++) {
            str1 += "a";
        }
        Date end = new Date(); // marcam timpul de sfarsit
        long duration = end.getTime() - start.getTime(); // diferenta de timp, in milisecunde
        System.out.println("String: " + duration);

        // facem aceeasi chestie din nou
        start = new Date();
        StringBuilder str2 = new StringBuilder("a");
        for(int i = 0; i < n; i++) {
            str2.append("a");
        }
        end = new Date();
        duration = end.getTime() - start.getTime();
        System.out.println("String builder: " + duration);
        // cu Stringbuilder + append dureaza mult mai putin ca nu stocheaza in memorie fiecare pozitie
    }
}
