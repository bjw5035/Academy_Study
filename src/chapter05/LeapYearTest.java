/*
 * 윤년 맞추기
 */
package chapter05;

import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        /*
         * 윤년 판별 : 판별식 : 400으로 나눠떨어지거나
         * 4로 나눠떨어지고 100으로는 나눠떨어지지 않을 때
         * 400 o / 600 x
         * 사용자 입력가능
         */

        while(true) {

            //int year = 600;
            boolean isLeap = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("연도를 넣으시오 : ");
            int year = sc.nextInt();
            //int year = Integer.parseInt(sYear);

            isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

            if(isLeap) {
                System.out.println(year + "는 윤년입니다.");

            }else {
                System.out.println(year + "는 윤년이 아닙니다.");

            }
            if(isLeap) {
                break;
            }
        }
    }
}
