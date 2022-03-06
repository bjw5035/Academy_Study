/*
 * 반복 연산하기
 */
package chapter05;

public class LoopEx2 {
    public static void main(String[] args) {

        /**
         * 누적을 제대로 알고 있는가?
         * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과값은 220
         * 패턴 찾는게 중요
         */
//		int n = 1; // 1
//		n = n + 2; // 1 + 2
//		n = n + 3; // (1 + 2) + 3...

        int sum = 0;
        int totalSum = 0;

        for(int i=1; i <= 10; i++) {
            sum = sum + i;
//		System.out.println(sum);
            totalSum = totalSum + sum;
        }
        System.out.println("totalSum : " + totalSum);

//		int sum = 0;
//        int totalSum = 0;
//        for(int i=1; i <=10; i++) {
//            sum += i;
//            totalSum += sum;
//        }
//        System.out.println("totalSum="+totalSum);
    }
}
