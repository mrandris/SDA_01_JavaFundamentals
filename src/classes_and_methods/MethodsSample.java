package classes_and_methods;

public class MethodsSample {
    // main method
    public static void main(String[] args) {
        MethodsSample x = new MethodsSample();
        System.out.println(x.max(7, 9));
        x.printVal(x.max(7,9));

        int[] arr = new int[20];
        x.printArray(arr);
        arr[5] = 123;
        x.printArrayForEach(arr);
    }

    // method to print a value of an integer
    public void printVal(int x) {
        System.out.println("x = " + x);
    }

    // method to find the maximum of two integers
    public int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    // method to print an array (simple for loop)
    public void printArray(int[] param) {
        for(int i = 0; i < param.length; i++) {
            System.out.print(param[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    // method to print an array (for-each)
    public void printArrayForEach(int[] param) {
        for (int x : param) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
}
