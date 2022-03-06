package chapter08;

public class Phone {
    String name;
    String color;
    String company;

    public Phone(String name, String color, String company) {
        this.name = name;
        this.color = color;
        this.company = company;
    }

    void call() {
        System.out.println("call");
    }

    void receive() {
        System.out.println("receive");
    }
}
