/*
 * 배수 연산하기
 */
package chapter05;

public class LoopEx {
    public static void main(String[] args) {

        /*
         * 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
         *
         */
        int sum = 0;
        for(int i=0; i < 21; i++) {
//			boolean isC = !(i % 2 == 0 || i % 3 == 0);
            boolean isC = i % 2 != 0 && i % 3 != 0;
            if(isC) {
                System.out.println(i);
                sum = sum + i;
            }
//			System.out.printf("%s, \n", isC);
        }
        System.out.println("sum=" + sum);
    }
}
