package chapter08;

public abstract class Animal {
    String type;
    String name;
    public Animal(String type, String name) {
        super();
        this.type = type;
        this.name = name;
    }
    abstract void sleep();
}
