package memberDB;

import java.util.List;
import java.util.Scanner;

public class UpdateAction implements Action {

    @Override
    public void execute(Scanner sc) {
        // 1. 삭제할 ID
        System.out.println("삭제할 ID : ");
        String id = sc.next();
        MemberVO member = null;
        List<MemberVO> members = MemberMain.members;
        int updateIndex = -1;
        int index = -1;

        for (MemberVO m : members) {
            index++;
            if (id.equals(m.getId())) {
                member = m;
                updateIndex = index;
                break;
            }
        }

        // id있으면 PW, NAME,AGE 수정
        if (member != null) {
            System.out.println("기존 PW : " + member.getPw());
            System.out.println("수정 PW");
            String pw = sc.next();
            System.out.printf("기존 NAME : %s%n", member.getName());
            System.out.print("수정 NAME : ");
            String name = sc.next();
            System.out.printf("기존 AGE %s%n", member.getAge());
            System.out.print("수정 AGE : ");
            int age = sc.nextInt();

            // 1. setxxx()
            member.setPw(pw);
            member.setName(name);
            member.setAge(age);

            // 2. MemberVO 주소 변경
            MemberVO m = new MemberVO(member.getId(), pw, name, age);
            member = m;
        } else {
            System.out.println("없는 ID입니다.");
        }
    }
}
