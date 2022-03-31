package memberDB;

import java.util.List;
import java.util.Scanner;

public class DeleteAction implements Action {

    @Override
    public void execute(Scanner sc) {
        // id 찾기
        System.out.print("삭제할 ID :");
        String id = sc.next(); // 1111
        MemberVO member = null;
        List<MemberVO> members = MemberMain.members;
        int deleteIndex = -1;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getId().equals(id)) {
                deleteIndex = i;
                break;
            }
        }
        // 삭제 : deleteIndex만 빼고 새로 복사
        if (deleteIndex != -1) {
            //add(), get(), remove(int index), remove(Object o)
            members.remove(deleteIndex);// 0, 0

        } else {
            System.out.println("삭제할 ID가 없습니다.");
        }
    }
}