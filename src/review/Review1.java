package review;

import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {
        System.out.println("아이디를 입력하세요. > ");
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();

        System.out.println("비밀번호를 입력하세요. > ");
        Scanner scan1 = new Scanner(System.in);
        String pw = scan1.nextLine();

        if (!id.equals("java")) {
            System.out.println("아이디가 일치하지 않습니다.");
        } else if (!pw.equals("hello")) {
            System.out.println("비밀번호가 일치하지 않습니다.");
        } else {
            System.out.println("환영합니다!");
        }
        scan.close();
        scan1.close();
    }
}
