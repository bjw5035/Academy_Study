package review;

import java.util.Scanner;

public class Review3 {
    public static void main(String[] args) {

        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. > ");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        int user = Integer.parseInt(a);
        int com = (int)(Math.random() * 3) + 1;
        int b = user - com;

        System.out.printf("You : %s, Com : %s \n",user,com);

        if (b == 1 || b == -2) {
            System.out.println("승리하셨습니다.");
        } else if (b == 2 || b == -1) {
            System.out.println("패배하셨습니다.");
        } else {
            System.out.println("무승부입니다.");
        }
        scan.close();
    }
}
