package chapter07;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("한개만  객체 생성");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
