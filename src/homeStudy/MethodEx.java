package homeStudy;

import java.util.Scanner;

public class MethodEx {
    // 리턴값이 있는 경우
    public static int add(int x) {
        int y = x * x;
        return y;
    }

    // 리턴값이 없는 경우
//    public static void addPrint(int x) {
//        int y = x * x;
//        addPrint(y);
//    }

    public static void main(String[] args) {

        int x = 10;
        int y = add(x);
        System.out.println("y = add(x) = " + y);

        x = 20;
        y = add(x);
        System.out.println(y);

        System.out.println("int input >");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = add(x);
        System.out.println(y);
    }
}
