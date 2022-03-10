package chapter16;

import java.io.*;

public class ObjectStreamReadTest {
    public static void main(String[] args) {
        User1 user1 = null; // 복원용

        FileInputStream fi = null; // 통로 뚫기
        ObjectInputStream oi = null;

        try {
            fi = new FileInputStream("userInfo.ser");
            oi = new ObjectInputStream(fi);
            user1 = (User1) oi.readObject();
            System.out.println(user1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oi.close();
                fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end!!");
    }
}
