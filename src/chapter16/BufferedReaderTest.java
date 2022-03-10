package chapter16;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        FileInputStream fi = null;
        InputStreamReader isr = null;
        BufferedReader bfr = null;

        try {
            fi = new FileInputStream("sample.csv");
            isr = new InputStreamReader(fi);
            bfr = new BufferedReader(isr);

            String str = null;
            while (true) {
                str = bfr.readLine();
                if(str == null) break;
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fi.close();
                isr.close();
                bfr.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
