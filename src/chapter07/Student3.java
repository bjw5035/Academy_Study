package chapter07;

public class Student3 {
    private String name;
    private int grade;
    private String department;

    // 기본 생성자만 있다면 생략 가능
    public Student3() {
    }

    public Student3(String name, int grade, String department) {
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    // set
    void setName(String name){
        if(name.equals("")) {
            name = "이름없음";
        }
        this.name = name;
    }
    void setGrade(int grade){
        if(grade == 0) {
            grade = 1;
        }
        this.grade = grade;
    }
    void setDepartment(String department){
        if(department.equals("")) {
            department = "학과없음";
        }
        this.department = department;
    }
    // get
    String getName(){
        return this.name;
    }
    int getGrade(){
        return this.grade;
    }
    String getDepartment(){
        return this.department;
    }
}
