package chapter16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
    public static void main(String[] args) {
        User1 user1 = new User1("hong", "1234", 20, "홍길동");
        User1 user2 = null; // 복원용

        FileOutputStream fo = null; // 통로 뚫기
        ObjectOutputStream oo = null;

        try {
            fo = new FileOutputStream("userInfo.ser");
            oo = new ObjectOutputStream(fo);
            oo.writeObject(user1);
            System.out.println("success!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oo.close();
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end!!");
    }
}
