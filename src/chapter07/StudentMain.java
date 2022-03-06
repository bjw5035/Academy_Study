package chapter07;

public class StudentMain {
    public static void main(String[] args) {

        Student stu1 = new Student(); // 기본생성자
        // 필드 초기화
        stu1.name = "홍길동";
        stu1.grade = 3;
        stu1.department = "국문과";
        Student stu2 = new Student("이순신", 20, "기계과"); // 기본생성자
        // 필드 초기화
        stu1.name = "홍길동";
        stu1.grade = 3;
        stu1.department = "국문과";
    }
}
