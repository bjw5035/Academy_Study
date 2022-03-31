package memberDB;

import java.sql.*;

public class JDBCUtil {

    public static Connection getConnection() {
        Connection conn = null;
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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void close (ResultSet rs, PreparedStatement pstmt, Connection conn){
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close (PreparedStatement pstmt, Connection conn){
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}