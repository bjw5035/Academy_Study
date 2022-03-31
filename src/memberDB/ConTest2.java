package memberDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConTest2 {
    public static void main(String[] args) {
        List<MemberVO> members = new ArrayList<MemberVO>();
        MemberDAO dao = new MemberDAO();
        int rs = 0;

        // insert
//        MemberVO member = new MemberVO("hong5", "5555", "홍5", 44);
//        rs = dao.InsertMember(member);
//        System.out.println("select rs = " + rs);

        // delete
//        MemberVO delmember = new MemberVO("hong5", "5555", "홍5", 44);
//        rs = dao.deleteMember(delmember);
//        System.out.println("del rs = " + rs);

        // update
//        MemberVO updamember = new MemberVO("hong4", "888", "", 656);
//        rs = dao.updateMember(updamember);
//        System.out.println("upda rs = " + rs);

        // hong1회원 한명 가져오기
//        MemberVO getMember = new MemberVO("hong1");
////        members = dao.getMember();
//        rs = dao.getMember();
//        System.out.println(rs);

        // 목록 가져오기
        members = dao.getMemberList();
        for (MemberVO m : members) {
            System.out.println(m);
        }
    }
}
