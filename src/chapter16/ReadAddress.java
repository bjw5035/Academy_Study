package chapter16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {
    public static void main(String[] args) {
        FileInputStream fi = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        StringTokenizer st = null;

        try {
            fi = new FileInputStream("address.csv");
            isr = new InputStreamReader(fi);
            br = new BufferedReader(isr);

            String str = null;
            String[] strArr = null;
            while ((str = br.readLine()) != null) {
                // split()
                strArr = str.split(",");
                for (String s : strArr) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }

            while ((str = br.readLine()) != null) {
                // StringTokenizer()
                st = new StringTokenizer(str, ",");
                while (st.hasMoreTokens()) {
                    System.out.print(st.nextToken() + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {

        }
    }
}
