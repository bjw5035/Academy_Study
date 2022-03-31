package memberDB;

import java.sql.*;

public class ConTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            //1. driver loading
            Class.forName(driver); // new

            //2. conn
            String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
            String user = "user1";
            String password = "Wodn93!@";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conn OK!!");
            String sql = "select * from member";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            MemberVO member = null;

            while(rs.next()) {
                String id = rs.getString("id");
                String pw = rs.getString("pw");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                member = new MemberVO(id, pw, name, age);
                System.out.println(member);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
