package chapter07;

public class Car2 {
    // this, this() : 자신의 클래스 내부에 있는 필드, 생성자에
    // 접근하기 위한 자기 자신의 instance
    // 속성, 필드, 멤버변수
    String color;
    String company;
    String type;

    public Car2() {
//        this.color = "화이트";
//        this.company = "기아";
//        this.type = "경차";
        this("화이트", "기아", "경차");
    }

    public Car2(String color) {
//        this.color = color;
        this(color, "기아", "경차");
    }
    public Car2(String color, String company) {
        this(color, company, "경차");
    }

    public Car2(String color, String company, String type) {
        this.color = color;
        this.company = company;
        this.type = type;
    }
}
