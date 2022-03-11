package homeStudy.class2;

public class Subway {
    String lineNumber;
    int passengerCount;
    int money;

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void takeSubway(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(lineNumber + " 호선의 남은 돈은 " + money + "입니다. ");
    }
}
