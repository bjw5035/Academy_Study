package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListGeEx3 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList();
        list.add(new Circle(3.0));
        list.add(new Circle(5.0));
        list.add(new Rectangle(3,4));
        list.add(new Rectangle(5,6));

        // area 합계
        double sum = sumArea(list);
        double length = sumLength(list);

//        double sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Shape c1 = (Shape) list.get(i);
//            sum = sum + c1.area();
//        }
        System.out.println("area : " + Math.round(sum));
        System.out.println("length : " + Math.round(length));

    }

    static double sumArea(List list) {
        // 합계
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Shape c1 = (Shape) list.get(i);
            sum = sum + c1.area();
        }
        return sum;
    }

    static double sumLength(List<Shape> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Shape c1 = (Shape) list.get(i);
            sum = sum + c1.length();
        }
        return sum;
    }
}
