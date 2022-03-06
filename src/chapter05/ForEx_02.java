/*
 * while문
 */
package chapter05;

public class ForEx_02 {
    public static void main(String[] args) {

        // 1~100까지의 합을 구하시오. for,while
        // 합 => 누적 => sum = sum + i; sum += i;

//		int sum = 0;
//		for(int i=1; i < 101; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지 합 : "+ sum);
//
//		int i = 1;
//		int sum = 0;
//		while(i<101) {
//			sum += i;
//			i++;
//		}
//		System.out.println("sum = "+ sum);
//
        // 짝수의 값만 합을 구하시오.

        int sum1 = 0;
        for(int i=0; i < 101; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        int i = 0;
        while(i<101) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
