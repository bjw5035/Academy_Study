package chapter08;

//public final class Car { // 마지막 클래스
public class Car { // 수정
    String color;
    String name;
    public void go() {
        System.out.println("go");
    }
    public final void back() { // 재정의 하지말고 내꺼 써라(재정의 못함)
        System.out.println("back");
    }
}
