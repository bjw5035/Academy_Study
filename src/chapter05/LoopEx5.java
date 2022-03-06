/*
 * 주사위 눈의 합을 구하시오
 */
package chapter05;

public class LoopEx5 {
    public static void main(String[] args) {

        /*
         * 두 개의 주사위를 던졌을 때
         * 눈의 합이 6이 되는 모든 경우의 수
         * (1,5)
         * (2,4)
         * (3,3)
         * (4,2)
         * (5,1)
         */

        for(int a=1; a<7; a++) {
            for(int b=1; b<7; b++) {
                if(a+b == 6) {

                    System.out.printf("(%s,%s)", a,b);
                }
            }
            System.out.println();
//			System.out.println(i);
        }
    }
}
