/*
배열
 */
package chapter06;

public class ArrEx10 {
    public static void main(String[] args) {

        // 첫번째
//        int[] iArr = new int[3];
//        iArr[0] = 1;

        int[][] matrix = new int[3][3];
//        int[][] matrix2 = new int[3][3];
//        matrix[0] = new int[3];
//        matrix[1] = new int[3];
//        matrix[2] = new int[3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
//        System.out.println(matrix.length); // 3
//        System.out.println(matrix[0].length); // 3
//        System.out.println(matrix[1].length); // 3
//        System.out.println(matrix[2].length); // 3

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%s,%s][%s] \n", i, j, matrix[i][j]);
            }
            System.out.println();
        }

        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
