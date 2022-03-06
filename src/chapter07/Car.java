package chapter07;

public class Car {
    // this, this() : 자신의 클래스 내부에 있는 필드, 생성자에
    // 접근하기 위한 자기 자신의 instance
    // 속성, 필드, 멤버변수
    String color;
    String company;
    String type;
    // 기능, 메서드, 멤버메서드
    public void go() {
        System.out.println("전진하다");
    }
    public void back() {
        System.out.println("후진하다");
    }

}
