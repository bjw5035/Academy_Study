/*
 * 중첩 반복문
 */
package chapter05;

public class LoopTest1 {
    public static void main(String[] args) {

        // 중첩 반복
        /*
         *****
         *****
         *****
         *****
         *****
         */

//		for(int j=0; j<6; j++) {
//			for(int i=0; i<6; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

        // for문 1개로 : * 25개필요, 5개 찍었는지 알아내기
        int count = 0;
        for(int i=1; i<26; i++) {
            count++; // 1
            System.out.print("*");
            if(count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
