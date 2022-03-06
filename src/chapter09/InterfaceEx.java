package chapter09;

public interface InterfaceEx { // 인터페이스는 all 추상메서드이다.
    // 상수
    public static final int MiN_PRICE = 0;
    public int MAX_PRICE = 100; // static final 생략 가능

    public abstract double meanPrice();
    public double totalPrice(); // abstract 생략 가능
}
