package chapter10;

public class RoundEx {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        double v1 = Math.PI * 1000;
        System.out.println(v1);
        double v2 = Math.round(v1);
        System.out.println(v2);
        double v3 = v2 / 1000;
        System.out.println(v3);
    }
}
