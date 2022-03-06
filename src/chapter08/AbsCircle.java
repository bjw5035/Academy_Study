package chapter08;

public abstract class AbsCircle extends AbsShape {
    int r;
    public AbsCircle(int r) {
        super("원");
        this.r = r;
    }
    @Override
    double area() {
        return r * r * Math.PI;
    }
    @Override
    double length() {
        return 2 * r * Math.PI;
    }
    @Override
    public String toString() {
        return "Shape [type=" + type + ", r=" + r + "]";
    }
}
