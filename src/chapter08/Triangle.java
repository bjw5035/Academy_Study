package chapter08;

import java.awt.Point;
import java.awt.Shape;

public abstract class Triangle extends Shape {
    java.awt.Point[] p = new java.awt.Point[3]; // 포함
    //    public Triangle() {
//        this(new Point(), 100); // (0,0) , r=100
//    }
    public Triangle(Point[] point) {
        this.p = p;
    }
    @Override
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p1=%s, c=%s]\n",p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
