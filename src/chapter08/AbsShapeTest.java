package chapter08;

import java.awt.Rectangle;
import java.lang.*;

public class AbsShapeTest {
    public static void main(String[] args) {

        FinalCircle fc = new FinalCircle(5);
//        AbsCircle ac = new FinalCircle(5);
//        System.out.println((int)fc.area());
//        System.out.println(ac.area());
//        System.out.println((int)fc.length());
//        System.out.println(ac.length());
//        System.out.println("==============");
        java.awt.Rectangle rc = new java.awt.Rectangle(5,5);
        AbsShape as2 = new Rectangle(5,5); // 가능
        System.out.println(rc.area());
        System.out.println(rc.length());
        System.out.println(as2.area());
        System.out.println(as2.length());
    }
}
