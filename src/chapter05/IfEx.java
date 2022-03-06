/*
 * 조건문(if ~ else)
 */
package chapter05;

public class IfEx {
    public static void main(String[] args) {

//		int score = 70;
//
//		if(score >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}

        // 홀짝(문제 -> 파악(패턴) -> 해결이 중요)
        int score = 50;

        int i = score % 2; // 0
        boolean b = i == 0; // i값이 0과 같나? 짝수냐?

        if(!b) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}
