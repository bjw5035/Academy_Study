package chapter08;

public class FinalCircle extends AbsShape{
    int r;
    public FinalCircle(int r) {
        super("원");
        this.r = r;
    }
    @Override
    double length() {
        double l = 2 * Math.PI * r;
        return l;
    }
    @Override
    double area() {
        double a = Math.PI * r * r;
        return a;
    }
}
