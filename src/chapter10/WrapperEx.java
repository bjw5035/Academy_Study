package chapter10;

public class WrapperEx {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = 10;
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true

        int i3 = i1;
        int i4 = i2;
        System.out.println(i3 == i4);


    }
}
