package chapter07;

public class AccessExMain {
    public static void main(String[] args) {
        AccessEx ae = new AccessEx();

        // int a = ae.a; private 접근 불가
        int b = ae.b; // protected 같은 패키지, 자손클래스 접근 가능
        int c = ae.c; // x 디폴트 , 같은 패키지
        int d = ae.d; // public
    }
}
