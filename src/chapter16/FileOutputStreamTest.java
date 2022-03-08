package chapter16;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        // 1글자씩 output
        // OutputStream - write()
        // FileOutputStream

        FileOutputStream fout = null;
        String msg = "Hello World!!";
        byte[] msgArr = msg.getBytes(); // byte[]

        try {
            fout = new FileOutputStream("test2.txt");
            fout.write(msgArr);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("write ok!!");
    }
}
