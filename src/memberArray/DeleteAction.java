package memberArray;

import java.util.Scanner;

public class DeleteAction implements Action {

    @Override
    public void execute(Scanner sc) {
        // 1. 삭제할 ID
        System.out.println("삭제할 ID : ");
        String id = sc.next();
        MemberVO member = null;
        MemberVO[] members = MemberMain.members;
        int deleteIndex = -1;
        int index = -1;

        for (MemberVO m : members) {
            index++;
            if (id.equals(m.getId())) {
                deleteIndex = index;
                break;
            }
        }
        // 삭제 : deleteIndex만 빼고 새로 복사
        if (deleteIndex != -1) {
            MemberVO[] temp = new MemberVO[members.length - 1];
            for (int i = 0; i < members.length; i++) {
                if (i == deleteIndex) {
                    continue;
                } else if (i > deleteIndex) {
                    temp[i - 1] = members[i];
                } else {
                    temp[i] = members[i];
                }
            }
            MemberMain.members = temp;

        } else {
            System.out.println("member not found!!");
        }
    }
}
