package chapter13;

public class Circle extends Shape{

    double r;

    public Circle() {
        this(1.0);
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    double length() {
        return 2 * Math.PI * r;
    }
}
