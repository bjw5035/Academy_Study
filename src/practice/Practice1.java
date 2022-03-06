package practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println("숫자를 입력하세요. > ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = n % 2;
        int b = n % 3;
        int c = 0;
        double d = 0.0;

        if (a == 1) {
            if (b == 0) {
                System.out.println(d = c / 3.0);
            } else {
                System.out.println(c = n * 3);
            }
        } else {
            if (b == 0) {
                System.out.println(d = c / 3.0);
            } else {
                System.out.println(c = n * 2);
            }
        }
    }
}
