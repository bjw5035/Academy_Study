/*
 * switch 문
 */
package chapter05;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {

        int number = 3;
//		char number = '3';

//		switch(number) {
//		case 1 :
//			System.out.println("1번");
//		case 2 :
//			System.out.println("2번");
//		case 3 :
//			System.out.println("3번");
//		case 4 :
//			System.out.println("4번");
//		case 5 :
//			System.out.println("5번");
//		default :
//			System.out.println("6번");
//		}

        // int가 아닌 char일때
//		switch(number) {
//		case '1' :
//			System.out.println("1번");
//			break;
//		case '2' :
//			System.out.println("2번");
//			break;
//		case '3' :
//			System.out.println("3번");
//			break;
//		case '4' :
//			System.out.println("4번");
//			break;
//		case '5' :
//			System.out.println("5번");
//			break;
//		default :
//			System.out.println("6번");
//		}

        // 예제 : 홀짝
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 넣으시오 >> ");
        int number1 = scanner.nextInt();
        int c = number1 % 2;
        switch(c) { // switch(number/10)이런 방식도 활용 가능
            case 1 :
                System.out.println("홀");
                break;
            case 0 :
                System.out.println("짝");
                break;
        }
    }
}
