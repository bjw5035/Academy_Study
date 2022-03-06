package homeStudy;

public class Student {
    // 멤버변수
    int studentId;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int i) {
//        this.grade = i;
        grade = i;
    }

    public static void main(String[] args) {
        StudentMain studentAhn = new StudentMain();
        StudentMain stdentGrade = new StudentMain();
        stdentGrade.grade = 2;
        studentAhn.studentName = "홍길동";

        System.out.println(stdentGrade.grade);
        System.out.println(stdentGrade.getGrade());
        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}