package chapter05;

import java.util.Scanner;

public class FlowTest9 {
    public static void main(String[] args) {

        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. > ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int user = Integer.parseInt(a);
        int com = (int)(Math.random() * 3) + 1;
        int b = user - com;

        System.out.println("당신은 "+ user +"입니다.");
        System.out.println("컴퓨터는 "+ com +"입니다.");

        if (b == 1 || b == -2) {
            System.out.println("승리");
        } else if (b == -1 || b == 2) {
            System.out.println("패배");
        } else {
            System.out.println("무승부");
        }
    }
}
