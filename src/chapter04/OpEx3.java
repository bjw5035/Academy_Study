/*
 * 산술 연산
 */
package chapter04;

public class OpEx3 {
    public static void main(String[] args) {

        // 결과값이 실수로 연산되게 하는 방법
        int a = 10;
        int b = 4;
        int i = a/b;
        double d = a / (double)b;
        System.out.println("10 / 4 = " + a / b);
        System.out.println("10 / 4 = " + (double)a / b);

        //char 연산
        char c1 = 'a';
        char c2 = 'b';
        int c3 = c1 + c2; // 자동형변환
//		int c3 = (char)(c1 + c2); // 문자열을 다시 정수형으로 바꿀때 방법
        int c4 = (int)c1 + (int)c2; // 강제형변환
//		char c = (char)c4; // 정수에서 문자열로 바꿀순 없음
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        //문자열 덧셈
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // 음수 사용
        int c = -a;
        System.out.println("c = "+ c);
    }
}
