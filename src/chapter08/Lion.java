package chapter08;

public class Lion extends Animal{

    public Lion(String type, String name) {
        super(type, name);
    }
    @Override
    void sleep() {
        System.out.println(this.name + " is sleep..");
    }
}
