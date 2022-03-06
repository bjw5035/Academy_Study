package chapter09.poly;

public class Child extends Parent {
    String name;
    @Override
    void run() {
        System.out.println("child run");
    }
    void game() {
        System.out.println("child game");
    }
}
