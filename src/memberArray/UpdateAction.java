package memberArray;

import java.util.Scanner;

public class UpdateAction implements Action{

    @Override
    public void execute(Scanner sc) {
        // 1. 수정할 ID
        System.out.println("tnwjd할 ID : ");
        String id = sc.next();
        MemberVO member = null;
        MemberVO[] members = MemberMain.members;
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
        System.out.println(member);
        // 2. 수정 : PW, NAME, AGE
        if (member != null) {
            System.out.println("PW : ");
            String pw = sc.next();
            System.out.println("NAME : ");
            String name = sc.next();
            System.out.println("AGE : ");
            int age = sc.nextInt();
            // member.setPw(pw);
            // member.setName(name);
            // member.setAge(age);
            member = new MemberVO(id, pw, name, age);
            members[index] = member;
        } else {
            System.out.println("member not found!!");
        }
    }
}
