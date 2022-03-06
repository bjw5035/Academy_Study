package chapter07;

public class CarMain2 {
    public static void main(String[] args) {

        Car[] cars = new Car[2];
        Car tico = new Car();
        Car pride = new Car();
        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";
        cars[0] = tico;
        pride.color = "블랙";
        pride.company = "기아";
        pride.type = "소형";
        cars[1] = pride;
        System.out.println(cars[0].color);
        for (Car car : cars) {
            System.out.println(car.color);
        }
    }
}
