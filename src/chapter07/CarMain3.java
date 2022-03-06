package chapter07;

public class CarMain3 {
    public static void main(String[] args) {

        Car2 car1 = new Car2();
        System.out.println(car1.color);
        System.out.println(car1.company);
        System.out.println(car1.type);
        Car2 car2 = new Car2("Red");
        System.out.println(car2.color);
        System.out.println(car2.company);
        System.out.println(car2.type);
        Car2 car3 = new Car3("Black", "Blue","현대");
        System.out.println(car3.color);
        System.out.println(car3.company);
        System.out.println(car3.type);
        Car2 car4 = new Car3("Black","BMW","대형차");
        System.out.println(car4.color);
        System.out.println(car4.company);
        System.out.println(car4.type);
    }
}
