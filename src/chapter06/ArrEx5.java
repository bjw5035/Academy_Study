/*
 * 배열 초기화
 */
package chapter06;

public class ArrEx5 {
    public static void main(String[] args) {

        String[] arrStr = new String[3];
        arrStr[0] = "홍길동";
        arrStr[1] = "이순신";
        arrStr[2] = "김유신";

        System.out.println(arrStr[0]);
        System.out.println(arrStr[1]);
        System.out.println(arrStr[2]);

        // 초기화
        String[] arrStr2 = {"홍길동", "이순신", "김유신"};

        for(int i=0; i<arrStr2.length; i++) {
            System.out.println(arrStr2[i]);
        }

        for(String s:arrStr) {
            System.out.println(s);
        }
    }
}
