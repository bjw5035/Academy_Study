/*
정렬(버블정렬)
 */
package chapter06;

import java.util.Arrays;

public class ArrTest03 {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < numArr.length-1-i; j++) {
                if (numArr[j] > numArr[j + 1]) {  // 2,1
                    int temp = numArr[j]; // 2를 temp에 담기
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp; // 1,2
                    changed = true;
                }
            }
            System.out.println(Arrays.toString(numArr));
            if (!changed) { // 변화가 없다면 혹은 자리바꿈이 없었다면 탈출
                break;
            }
        }
    }
}
