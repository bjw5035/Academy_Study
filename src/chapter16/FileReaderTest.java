package chapter16;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {

        FileReader fr = null;

        try {
            fr = new FileReader("sample.csv"); // 한글이 됨
            int readChar = -1;
            while ((readChar = fr.read()) != -1) {
                System.out.print((char) readChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
