package memberDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    public List<MemberVO> getMemberList() {
        List<MemberVO> members = new ArrayList<MemberVO>();
        Connection conn = null;

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            conn = JDBCUtil.getConnection();
            String sql = "select * from member";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            MemberVO member = null;

            while (rs.next()) {
                String id = rs.getString("id");
                String pw = rs.getString("pw");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                member = new MemberVO(id, pw, name, age);
                members.add(member);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, conn);
        }

        return members;
    }

    public int InsertMember(MemberVO member) {
        int rs = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = JDBCUtil.getConnection();

        try {
            String id = member.getId();
            String pw = member.getPw();
            String name = member.getName();
            int age = member.getAge();

            String sql = "insert into member(id,pw,name,age) values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql); // sql에 ?가 4개 있음
            pstmt.setString(1,id);
            pstmt.setString(2,pw);
            pstmt.setString(3,name);
            pstmt.setInt(4,age);
            rs = pstmt.executeUpdate(); // 0실패, 1 성공

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt, conn);
        }
        return rs;
    }

    public int deleteMember(MemberVO member) {
        int rs = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = JDBCUtil.getConnection();

        try {
            String id = member.getId();
            String pw = member.getPw();
            String name = member.getName();
            int age = member.getAge();

            String sql = "delete from member where id=?";
            pstmt = conn.prepareStatement(sql); // sql에 ?가 4개 있음
            pstmt.setString(1,id);
            rs = pstmt.executeUpdate(); // 0실패, 1 성공

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt, conn);
        }
        return rs;
    }

    public int updateMember(MemberVO member) {
        int rs = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = JDBCUtil.getConnection();

        try {
            String id = member.getId();
            String pw = member.getPw();
            String name = member.getName();
            int age = member.getAge();

            String sql = "update member set pw=?,age=? where id=?";
            pstmt = conn.prepareStatement(sql); // sql에 ?가 4개 있음
            pstmt.setString(1,pw);
            pstmt.setInt(2,age);
            pstmt.setString(3,id);
            rs = pstmt.executeUpdate(); // 0실패, 1 성공

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(pstmt, conn);
        }
        return rs;
    }

    // getMember() : ID로 검색해서 hong1 회원 한명 가져오기
//    public int getMember(MemberVO member) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        String rs = null;
//
//        conn = JDBCUtil.getConnection();
//        try {
//            String id = member.getId();
//
//            String sql = "select * from member where id=?";
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1,id);
//            pstmt.executeQuery();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            JDBCUtil.close(pstmt, conn);
//        }
//    }
    // getCount() : 회원이 몇명인지 가져오기
}
