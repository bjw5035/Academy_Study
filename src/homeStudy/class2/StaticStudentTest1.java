package homeStudy.class2;

public class StaticStudentTest1 {
    public static void main(String[] args) {
        StaticStudent std = new StaticStudent();
        std.setStudentName("홍길동");
        System.out.println(std.serialNum);
        std.serialNum++;

        StaticStudent std1 = new StaticStudent();
        std.setStudentName("이순신");
        System.out.println(std.serialNum);
        System.out.println(std1.serialNum);
    }
}
