package chapter08;

abstract class AbsShape {
    String type;

    public AbsShape(String type) {
        this.type = type;
    }

    abstract double area();
    abstract double length();
}
