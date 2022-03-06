/*
2차원 배열(다차원 배열)
 */
package chapter06;

public class ArrEx11 {
    public static void main(String[] args) {

        int[][] arrInt = new int[3][];

        arrInt[0] = new int[]{1};
        arrInt[1] = new int[]{2,3};
        arrInt[2] = new int[]{4,5,6};

        // 예제1
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.println(arrInt[i][j]);
            }
            System.out.println();
        }

        // 예제 2
        for (int[] arr : arrInt) {
            for (int i : arr) {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
