package classes_and_methods;

public class IncrementingInteger {
    public static int incrementingStep = 1;
    public int value;

    public IncrementingInteger(int startvalue) {
        value = startvalue;
    }

    public int increment() {
        value += incrementingStep; // sintagma competa ar fi: value = value + IncrementingInteger.incrementingStep;
        return value;
    }

    public void printValue() {
        System.out.println("value = " + value);
    }

    public static void main(String[] args) {
        // instantiating class
        IncrementingInteger x = new IncrementingInteger(10);
        IncrementingInteger y = new IncrementingInteger(115);

        x.printValue();
        x.increment();
        x.printValue();

        y.printValue();
        y.increment();
        y.printValue();

        System.out.println(" ");
        IncrementingInteger.incrementingStep = 5;
        // incrementingStep este o variabila statica, are efect pe toate instantele a clasei

        x.printValue();
        x.increment();
        x.printValue();

        y.printValue();
        y.increment();
        y.printValue();
    }
}
