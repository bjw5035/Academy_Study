/*
 * 별 출력하기
 */
package chapter05;

public class LoopEx4 {
    public static void main(String[] args) {

        /*
         *
         **
         ***
         ****
         *****
         */

        for(int i=1; i < 6; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        /*
         *
         ***
         *****
         *******
         *********
         */
        for(int i=1; i < 10; i+=2) {
            for(int j=0; j<i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
