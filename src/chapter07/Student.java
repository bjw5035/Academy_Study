package chapter07;

public class Student {
    String name;
    int grade;
    String department;
    // 기본 생성자만 있다면 생략 가능
    public Student() {
    }
    // 오버로딩된 생성자
    public Student(String name, int grade, String department) {
        this.name = name;
        this.grade = grade;
        this.department = department;
    }
}
