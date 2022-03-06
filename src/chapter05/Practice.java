package chapter05;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        System.out.println("숫자를 입력하시오. > ");
        Scanner scan = new Scanner(System.in);
        Double number = scan.nextDouble();


        if (number % 2 == 1) {
            if (number % 3 == 0) {
                System.out.println(number / 3);
            } else {
                System.out.println((int)(number * 3));
            }
        } else {
            if (number % 3 == 0) {
                System.out.println(number / 3);
            } else {
                System.out.println((int)(number * 2));
            }
        }
    }
}
