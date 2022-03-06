/*
 * 2x + 4y = 10 방정식 풀기
 */
package chapter05;

public class LoopEx6 {
    public static void main(String[] args) {

        /*
         * 2x+4y=10 방정식의 해  x y, 범위 0<=x<=10, 0<=y<=10
         */

//		int x = 0;
//		int y = 0;

        for(int x=0; x <= 10; x++) {
            for(int y=0; y <= 10; y++) {
                if(2*x + 4*y == 10) {
//					System.out.printf("%sx + %sy = %s", x, y, x*y);
                    System.out.printf("(%s, %s)", x, y);
                }
            }
            System.out.println();
        }
    }
}
