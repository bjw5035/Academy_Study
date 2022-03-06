package practice;

import java.util.Scanner;

public class FlowTest8 {
    public static void main(String[] args) {

        System.out.println("가위, 바위, 보 중 하나를 입력하세요. > ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int user = 0;
        int com = (int)(Math.random() * 3) + 1;
        int b = user - com;

        if (a.equals("가위")) {
            user = 1;
        } else if (a.equals("바위")) {
            user = 2;
        } else {
            user = 3;
        }

        if (b == 1 || b == -2) {
            System.out.println("승리");
        } else if (b == -1 || b == 2) {
            System.out.println("패배");
        } else {
            System.out.println("무승부");
        }
    }
}
