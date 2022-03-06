/*
 * Lotto
 */
package chapter06;

import java.util.Arrays;

public class LottoOne {
    public static void main(String[] args) {

        // 1~45 중복되지 않는 6개 공을 추출, 1/800만분

        int[] lottoOne = new int[6];  // {0,0,0,0,0,0}
        int idx = 0;

        while(true) {

            // 1번째 값
            boolean insert = true; // 참,거짓 체크
            int number = (int)(Math.random() * 45) + 1; // 넣어야 할 값 25

            // 중복값 체크
            for(int i=0; i<=idx; i++) {
                //			lottoOne[i] = number;
                if(lottoOne[i] == number) { // 중복이 있는지 체크, 중복이 있으면
                    insert = false; // 배열에 넣지마라라는 상태
                }
            }

            if(insert == true) {  // 넣어라
                lottoOne[idx] = number;
                idx++;
            }
            if(idx == 6) {
                break;
            }
            System.out.println(Arrays.toString(lottoOne));
        }
//		for(int n:lottoOne) {
//			System.out.print(n + " ");
//		}
    }
}
