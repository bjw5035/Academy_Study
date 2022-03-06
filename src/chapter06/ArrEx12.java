/*
3차원 배열
 */
package chapter06;

public class ArrEx12 {
    public static void main(String[] args) {

        int[][][] arrInt = new int[3][3][3];
        int value = 0;

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                for (int k = 0; k < arrInt[i][j].length; k++) {
                    arrInt[i][j][k] = value++;
                }
            }
        }

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                for (int k = 0; k < arrInt[i][j].length; k++) {
                    System.out.print(arrInt[i][j][k] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("===================");
        for (int[][] i : arrInt) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k+ " ");
                }
            }
            System.out.println();
        }
    }
}
