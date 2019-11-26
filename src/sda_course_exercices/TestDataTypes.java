package sda_course_exercices;

public class TestDataTypes {
    public static void main(String[] args) {
        int maxInteger = 2147483647;
        System.out.println(maxInteger);
        System.out.println(maxInteger + maxInteger);

        double ddd = 3.2353;
        System.out.println((double)Math.round(ddd * 100d) / 100d);
        System.out.println(((int)(ddd * 100)) / 100d);

        String sample = "0123456789";
        String substring1 = sample.substring(1, 5);
        System.out.println(substring1);
        String substring2 = sample.substring(6, 8);
        System.out.println(substring2);

        System.out.println("charAt(3): " + sample.charAt(3));

        sample.replace('1', 'A');

        String a = "abc";
        String b = "abc";
        String c = new String ("abc");

        System.out.println();
        System.out.println("a == b: dgdfdf" + a == b);
        System.out.println("a.equals(b): " + a.equals(b));

        System.out.println();
        System.out.println("a == c: " + a == c);
        System.out.println("c == a: " + c == a);
        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("c.equals(a): " + c.equals(a));

        System.out.println("test \ntest \ntest");
        System.out.print("test \ntest \ntest\n");
        System.out.println("test \ttest \ttest\b\b");
    }
}
