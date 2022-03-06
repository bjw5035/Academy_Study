/*
 * 중첩 반복문
 */
package chapter05;

public class LoopTest2 {
    public static void main(String[] args) {

        /*
         11111
         22222
         33333
         44444
         55555
         */

        int n = 1;
        for(int i=1; i < 6; i++) {
            for(int j=1; j<6; j++) {
                System.out.print(j);
            }
//			n++;
            System.out.println();
        }
    }
}
