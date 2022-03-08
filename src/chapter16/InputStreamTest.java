package chapter16;

import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        int var_byte = -1;

        System.out.println("영문자, 숫자입력 >> ");
        while (true) {
            try {
                var_byte = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (var_byte == 10 || var_byte == 13) {
                break;
            } else {
                System.out.println(var_byte + ":" + (char)var_byte);
            }
        }
    }
}
