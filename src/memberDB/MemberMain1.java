package memberDB;

import java.util.Scanner;

public class MemberMain1 {

    // 저장소 : Array
    static MemberVO[] members = new MemberVO[0];

    public static void main(String[] args) {

        // CRUD => C:1, R:2, U:3, D:4, Q:5
        boolean isStop = false;
        Scanner sc = new Scanner(System.in);
        MemberService ms = new MemberService();
        while (true) {
            System.out.println("== 메뉴 선택 ==");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 목록보기");
            System.out.println("3. 회원 정보수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 종료");

            String command = sc.next();
            switch (command) {
                case "1":
                    System.out.println("1. 회원가입");
                    ms.process(new AddAction(), sc);
                    break;
                case "2":
                    System.out.println("2. 회원 목록보기");
                    System.out.println("회원수 : " + MemberMain1.members.length);
                    break;
                case "3":
                    System.out.println("3. 회원 정보수정");
                    break;
                case "4":
                    System.out.println("4. 회원 삭제");
                    break;
                case "5":
                    System.out.println("5. 나가기");
                    isStop = true;
                    break;
            } // switch end

            if (isStop) {
                break;
            } // if end
        } // while end
    } // main() end
} // class end
