package chapter08;

public class Eagle extends Animal{
    public Eagle(String type, String name) {
        super(type, name);
    }
    @Override
    void sleep() {
        System.out.println(this.name + " is sleep..");
    }
}
