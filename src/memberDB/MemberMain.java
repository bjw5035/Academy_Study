package memberDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

    // member 저장 배열
    static List<MemberVO> members = new ArrayList<MemberVO>();

    public static void main(String[] args) {

        MemberService ms = new MemberService();
        Action action = null;
        Scanner sc = new Scanner(System.in);
        boolean isStop = false;
        while (true) {
            System.out.println("== 메뉴 선택 == ");
            System.out.println("1. 회원 가입");
            System.out.println("2. 회원 목록 보기");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 회원 검색");
            System.out.println("Q. 나기기");

            String command = sc.next();
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
                    System.out.println("3. 회원 정보 수정");
                    break;
                case "4":
                    System.out.println("4. 회원 삭제");
                    break;
                case "5":
                    System.out.println("5. 나기기");
                    isStop = true;
                    break;
            } // switch end
            if (isStop) {
                break;
            }
        } // while end
    } // main() end
} // class end
