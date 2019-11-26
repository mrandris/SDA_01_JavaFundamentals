package classes_and_methods;

public class Person {
    public String name;
    public int age;

    // constructor
    public Person (String name, int age ) {
        this.name = name;
        this.age = age;
        System.out.println("Person created");
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // behavior
    public void sayHelloTo(Person someone) {
        System.out.println(getName() + " said hello to " + someone.getName());
    }
}
