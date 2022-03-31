package memberDB;

import java.sql.*;

public class ConTestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int rs = 0;

        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            //1. driver loading
            Class.forName(driver); // new

            //2. conn
            String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
            String user = "user1";
            String password = "Wodn93!@";
            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Conn OK!!");

            MemberVO member = new MemberVO("hong3", "3333", "홍3", 33);
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


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
