package homeStudy.class2;

public class StaticStudent {
    public static int serialNum = 100;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
