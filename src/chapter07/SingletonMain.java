package chapter07;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
