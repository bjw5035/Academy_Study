package chapter05;

import java.util.Scanner;

public class Review2 {
    public static void main(String[] args) {

        System.out.println("주민번호를 입력하세요. (000000-0000000) > ");
        Scanner scan = new Scanner(System.in);
        String regNo = scan.nextLine();

        char gender;
        gender = regNo.charAt(7);

        if (gender == '1' || gender == '3') {
            System.out.println("당신은 남자입니다.");
        } else if (gender == '2' || gender == '4') {
            System.out.println("당신은 여자입니다.");
        } else {
            System.out.println("당신은 외국인입니다.");
        }
        scan.close();
    }
}
