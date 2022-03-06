package chapter07;

public class StudentMain2 {
    public static void main(String[] args) {

        Student2 stu1 = new Student2(); // 기본생성자
        // 필드 초기화
        stu1.name = "홍길동";
        stu1.grade = 1;
        stu1.department = "국문과";
        Student2 stud2 = new Student2("이순신"); // 기본생성자
        // 필드 초기화
        stu1.grade = 2;
        stu1.department = "수학과";
        Student2 stu3 = new Student2("강감찬", 3); // 기본생성자
        // 필드 초기화
        stu1.department = "수학과";
        Student2 stu2 = new Student2("을지문덕", 3, "물리과"); // 기본생성자
        System.out.println(stu1.name);
        System.out.println(stu2.name);
        System.out.println(stu3.name);
//        System.out.println(stu4.name);
    }
}
