package classes_and_methods;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 20);
        Person bob = new Person("Bob", 25);
        Person fred = new Person("Fred", 25);

        john.name = "John";
        john.age = 20;
        john.setAge(20);

        bob.name = "Bob";
        bob.age = 25;
        bob.setAge(25);

        System.out.println(john.name+ " is " + john.age + " years old.");
        System.out.println(bob.name + " is " + bob.age + " years old.");

        // or with setters and getters
        System.out.println(john.getName()+ " is " + john.getAge() + " years old.");
        System.out.println(bob.getName() + " is " + bob.getAge() + " years old.");

        john.sayHelloTo(bob);
        john.sayHelloTo(fred);
    }
}
