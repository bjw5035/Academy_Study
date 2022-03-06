package chapter07;

public class StudentMain3 {
    public static void main(String[] args) {
        Student3 stu1 = new Student3();
        // 필드 초기화
        stu1.setName("");
        stu1.setGrade(0);
        stu1.setDepartment("");
        System.out.println(stu1.getName());
        System.out.println(stu1.getGrade() + "학년");
        System.out.println(stu1.getDepartment());
        Student3 stu2 = new Student3("이순신", 1, "기계");
        stu2.setGrade(2);
        System.out.println(stu1.getName());
        System.out.println(stu1.getGrade() + "학년");
        System.out.println(stu1.getDepartment());
    }
}
