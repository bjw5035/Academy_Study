package memberArray;

import java.util.Scanner;

public class AddAction implements Action{
    @Override
    public void execute(Scanner sc) {
        // 회원 가입
        System.out.println("== 회원 정보 입력 ==");
        System.out.println("ID : ");
        String id = sc.next();
        System.out.println("PW : ");
        String pw = sc.next();
        System.out.println("NAME : ");
        String name = sc.next();
        System.out.println("AGE : ");
        int age = sc.nextInt();

        MemberVO member = new MemberVO(id, pw, name, age);
        int memberCount = MemberMain1.members.length;
        MemberVO[] temp = new MemberVO[memberCount+1]; // 1개로 늘어남
        for (int i = 0; i < memberCount; i++) {
            temp[i] = MemberMain1.members[i];
        }
        temp[temp.length -1] = member;
        MemberMain1.members = temp;
    }
}
