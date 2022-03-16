package homeStudy.arraylist;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectList = new ArrayList<Subject>();

    public Student() {

    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String name, int scorePoint) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(scorePoint);
        subjectList.add(subject);

    }

    public void showInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println("학생" + studentName + "의 " + s.getName() + "과목 성적은" + s.getScorePoint() + "입니다.");
        }
        System.out.println("학생" + studentName + "의 총점은 " + total + "입니다.");
    }

}
