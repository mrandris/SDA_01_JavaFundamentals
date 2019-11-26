package classes_and_methods;

public class PlayerClassSample {
    // player state
    public String name = "Ion";
    public int age = 18;
    public long bestscore = 0;

    // player behavior
    public void play() {
        System.out.println(name + " is playing");
    }

    public void changeName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        PlayerClassSample p1 = new PlayerClassSample();

        System.out.println(p1.name);

        p1.name = "Ioana"; // sau cu urmatorul rand, invocand functia definita mai sus
        System.out.println("name: " + p1.name + " age: " + p1.age);

        p1.changeName("Andris");
        System.out.println("name: " + p1.name + " age: " + p1.age);

        p1.play();
    }
}
