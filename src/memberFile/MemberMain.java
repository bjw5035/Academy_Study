package memberFile;

import java.util.Scanner;

public class MemberMain {

    // 저장소 : File

    public static void main(String[] args) {

        // C-1, R-2,U-3,D-4,Q-5
        boolean isStop = false;
        Scanner sc = new Scanner(System.in);
        MemberService ms = new MemberService();
        while (true) {
            System.out.println("== 메뉴 선택 == ");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 목록 보기");
            System.out.println("5. 나기기");

            String command = sc.next();
            Action action = null;
            switch (command) {
                case "1":
                    System.out.println("1. 회원 가입");
                    action = new AddAction();
                    ms.process(action, sc);
                    break;
                case "2":
                    System.out.println("2. 회원 목록 보기");
                    action = new ListAction();
                    ms.process(action, sc);
                    break;
                case "3":
                    System.out.println("3. 나기기");
                    isStop = true;
                    break;
            } // switch end
            if (isStop) {
                break;
            }
        } // while end
    } // main() end
} // class end
