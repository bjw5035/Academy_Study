package chapter05;

public class MyMath {
    public static int calc(int a, int b, char c) {
        int rs = 0;
        if(c == '+') {
            rs = a + b;
        }else if(c == '-') {
            rs = a - b;
        }else if(c == '*') {
            rs = a * b;
        }else if(c == '/') {
            if(b==0) {
                rs = 0; // 계산 불가
            }else {
                rs = a / b;
            }
        }else {
            rs = 0; // 계산 불가
        }
        return rs;
    }
}
