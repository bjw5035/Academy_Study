package chapter08;

public class Rectangle extends AbsShape{
    int width, height;
    public Rectangle(int width, int height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        double a = width * height;
        return a;
    }
    @Override
    double length() {
        double l = (width + height) * 2;
        return l;
    }
}
