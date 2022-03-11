package homeStudy.class2;

public class Student {
    public String studentName;
    public int grade;
    public int money;


    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.Take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.takeSubway(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + " 님의 남은 돈은 " + money + "입니다. ");
    }
}
