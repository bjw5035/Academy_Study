package homeStudy.class2;

public class TakeTrans {
    public static void main(String[] args) {
        Student student1 = new Student("Jams", 500);
        Student student2 = new Student("Jams", 500);

        Bus bus100 = new Bus(100);
        student1.takeBus(bus100);
        student1.showInfo();
        bus100.showInfo();

        Subway subway = new Subway("2호선");
        student2.takeSubway(subway);
        student2.showInfo();
        subway.showInfo();
    }
}
