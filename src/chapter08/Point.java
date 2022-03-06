package chapter08;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}
