/*
 * 증감 연산
 */
package chapter04;

public class OpEx4 {
    public static void main(String[] args) {

        int a = 10;
        int b;

        a = a + 1;
        a += 1;
        ++a; //전위 연산
        a--; //후위 연산
        System.out.println(a);

        // 전위, 후위 연산 차이
        a = 10;
        b = a++;
        System.out.printf("(a,b) = (%s, %s)", a, b);
        System.out.println();

        b = ++a;
        System.out.printf("(a,b) = (%s, %s)", a, b);
        System.out.println();
    }
}
