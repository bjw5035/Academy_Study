/*
셔플
 */
package chapter06;

import java.util.Arrays;

public class Lotto01 {
    public static void main(String[] args) {

        int[] lottoBall = new int[45];

        for (int i = 0; i < lottoBall.length; ++i) {
            lottoBall[i] = i+1; // 0 ~ 44 => 1 ~ 45
        }
        for (int i = 0; i < 100; i++) {
            int r = (int)(Math.random() * 44) + 1; // 0 ~ 44 => 0 ~ 44 + 1
//            System.out.println("r=" +r);
            // 0,1 => 1, 0 만들기
            int temp = lottoBall[0];
            lottoBall[0] = lottoBall[r];
            lottoBall[r] = temp;
        }
        System.out.println(Arrays.toString(lottoBall)); // 1,0
        // 로또 한장 [0 ~ 5]
        int[] lottoOne = new int[6];
        for (int i = 0; i < lottoOne.length; i++) {
            lottoOne[i] = lottoBall[i];
        }
        System.out.println(Arrays.toString(lottoOne)); // 1,0
    }
}
