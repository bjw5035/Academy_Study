package chapter16;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        String msg = "FileWriter 테스트 입니다 1. \r\n";
        msg += "FileWriter 테스트 입니다 2. \r\n";

        try {
            // overwrite, append
            fw = new FileWriter("writer_sample.csv", true);
            fw.write(msg);
            System.out.println("success!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                System.out.println("file close");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
