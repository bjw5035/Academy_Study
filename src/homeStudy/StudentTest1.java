package homeStudy;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "홍길동";
        System.out.println(student1.studentName);
        System.out.println(student1.getStudentName());

        Student student2 = new Student();
        student2.studentName = "이순신";
        System.out.println(student2.studentName);
        System.out.println(student2.getStudentName()); // Student 메서드 사용
    }
}
