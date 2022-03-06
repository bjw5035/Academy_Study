/*
셔플
 */
package chapter06;

import java.util.Arrays;

public class Lotto5 {
    public static void main(String[] args) {

        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; ++i) {
            numArr[i] = i; // 0 ~ 9
        }
        for (int i = 0; i < 100; i++) {
            int r = (int)(Math.random() * 9) + 1; // 1 ~ 9 => 0 ~ 8 + 1
//            System.out.println("r=" +r);
            // 0,1 => 1, 0 만들기
            int temp = numArr[0];
            numArr[0] = numArr[r];
            numArr[r] = temp;
        }
        System.out.println(Arrays.toString(numArr)); // 1,0
    }
}
