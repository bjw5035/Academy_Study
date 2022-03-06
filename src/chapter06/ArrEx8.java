package chapter06;

public class ArrEx8 {
    public static void main(String[] args) {

        /*
         * 배열을 이용하여 1 ~ 100까지 입력 후 출력하시오.
         * 배열 명 : number
         */

        int[] number = new int [100];

        for(int i=0; i<number.length; i++) {
            number[i] = i + 1;
        }
//		for(int i=0; i<number.length; i++) {
//			System.out.println(number[i]);
//		}

        /*
         * 1 ~ 100까지 합을 구하시오.
         */
        int sum = 0;
        for(int i=0; i<number.length; i++) {
//			System.out.println(number[i]);
            sum = sum + number[i];
        }
        System.out.println("sum = " + sum);

        /*
         * 1 ~ 100까지 홀짝의 합을 각각 구하시오.
         */
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0; i<number.length; i++) {
            if(number[i] % 2 == 0) {
                evenSum += number[i];
            }else {
                oddSum += number[i];
            }
        }
        for(int n:number) {
            if(n%2 == 0) {
                evenSum += n;
            }else {
                oddSum += n;
            }
        }
        System.out.printf("even: %s, odd: %s\n", evenSum, oddSum);

        for(int n :number) { // 꺼내어 지는거 : 이후는 꺼낼수 있는 거(꺼낸다를 의미(출력), 배열)
//			System.out.println(n);
            sum = sum + n;

        }
    }
}
