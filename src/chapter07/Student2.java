package chapter07;

public class Student2 {
    String name;
    int grade;
    String department;
    // 오버로딩된 생성자가 있다면 생략 시 사용 불가
    // 오버로딩된 생성자가 있다면 기본생성자 있어야 사용 가능
    public Student2() {
    }
    public Student2(String n) {
    }
    public Student2(String n, int g) {
        name = n;
        grade = g;
    }
    public Student2(String n, int g, String d) {
        name = n;
        grade = g;
        department = d;
    }
}
