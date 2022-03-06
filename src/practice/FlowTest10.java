package practice;

import java.util.Scanner;

public class FlowTest10 {
    public static void main(String[] args) {

        System.out.println("주민번호를 입력하세요. (000000-0000000 >");
        Scanner scan = new Scanner(System.in);
        String regNo = scan.nextLine();

        char gender = regNo.charAt(7);

        if (gender == '1' || gender == '3') {
            System.out.println("남자");
        } else if (gender == '2' || gender == '4' ) {
            System.out.println("여자");
        } else {
            System.out.println("외국인");
        }
    }
}
