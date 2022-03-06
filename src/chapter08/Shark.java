package chapter08;

public class Shark extends Animal{
    public Shark(String type, String name) {
        super(type, name);
    }
    @Override
    void sleep() {
        System.out.println(this.name + " is sleep..");
    }
}
