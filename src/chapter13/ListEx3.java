package chapter13;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        List list = new ArrayList();
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
//        Circle c1 = (Circle) list.get(0);
//        sum = sum + c1.area();
//        Circle c2 = (Circle) list.get(0);
//        sum = sum + c2.area();
//        Rectangle rt1 = (Rectangle) list.get(2);
//        sum = sum + rt1.area();
//        Rectangle rt2 = (Rectangle) list.get(3);
//        sum = sum + rt2.area();
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

    static double sumLength(List list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Shape c1 = (Shape) list.get(i);
            sum = sum + c1.length();
        }
        return sum;
    }
}
