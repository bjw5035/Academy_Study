package chapter16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        // file 존재 workspace 밑에 : test.txt
        FileInputStream fIn = null;

        try {
            fIn = new FileInputStream("/Users/jaewoo/IdeaProjects/Academy_Study/src/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int var_read = -1;

        try {
            while (true) {
                var_read = fIn.read();
                if(var_read == -1) break;
                System.out.print((char)var_read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
