package review;

import java.util.Scanner;

public class Review4 {
    public static void main(String[] args) {
        System.out.println("가위, 바위, 보 중 하나를 입력하세요. > ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int user = Integer.parseInt(a);
        int com = (int)(Math.random() * 3) + 1;
        String b = "";
        int c = user - com;

        if (a.equals("가위")) {
            user = 1;
        } else if (a.equals("바위")) {
            user = 2;
        } else {
            user = 3;
        }

        if (com == 1) {
            b = "가위";
        } else if (com ==  2) {
            b = "바위";
        } else {
            b = "보";
        }

        System.out.printf("You : %s, Com : %s \n", a, b);

        if (c == 1 || c == -2) {
            System.out.println("승리하셨습니다.");
        } else if (c == 2 || c == -1) {
            System.out.println("패배하셨습니다.");
        } else {
            System.out.println("무승부입니다.");
        }
        scan.close();
    }
}
