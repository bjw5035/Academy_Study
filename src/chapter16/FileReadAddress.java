package chapter16;

import java.io.*;
import java.util.StringTokenizer;

public class FileReadAddress {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        StringTokenizer st = null;

        try {
            fr = new FileReader("address.csv");
            br = new BufferedReader(fr);

            String str = null;
//            String[] strArr = null;
//            while ((str = br.readLine()) != null) {
//                // split()
//                strArr = str.split(",");
//                for (String s : strArr) {
//                    System.out.print(s + " ");
//                }
//                System.out.println();
//            }

            while ((str = br.readLine()) != null) {
                // StringTokenizer()
                st = new StringTokenizer(str, ",");
                while (st.hasMoreTokens()) {
                    System.out.print(st.nextToken() + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {

        }finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
