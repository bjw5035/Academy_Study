package practice_problem;

public class Exercise {
    public static void main(String[] args) {

        // 연습문제 : 1부터 더했을때 합이 500이 넘는 자연수는 얼마인가?
        // 답 : num = 32, sum = 528
//        int sum = 0;
//        int num;
//
//        for (num = 1; ; num++) {
//            sum += num;
//            if (sum > 501) {
//                break;
//            }
//        }
//        System.out.println(sum);
//        System.out.println(num);

        // 연습문제 : operator값이 +,-,*,/인 경우에 사칙연산을 수행하는 프로그램을 if~else문과 switch~case문을 사용해 작성하기
//        int num1 = 10;
//        int num2 = 2;
//        char operator = '+';
//        int sum = 0;
//
//        if (operator == '+') {
//            sum = num1 + num2;
//        } else if (operator == '-') {
//            sum = num1 - num2;
//        } else if (operator == '*') {
//            sum = num1 * num2;
//        } else if (operator == '/') {
//            sum = num1 / num2;
//        } else {
//            System.out.println("연산자 오류입니다.");
//            return;
//        }
//        System.out.println("결과값은 " + sum + " 입니다.");

//        switch (operator) {
//            case '+':
//                sum = num1 + num2;
//                break;
//            case '-':
//            sum = num1 - num2;
//                break;
//            case '*':
//            sum = num1 * num2;
//                break;
//            case '/':
//            sum = num1 / num2;
//                break;
//            default:
//                System.out.println("연산 오류");
//                return;
//        }
//        System.out.println(sum);
//
        // 연습문제 : 구구단을 짝수 단만 출력하시오
//        int a = 2;
//        int b = 0;
//        int sum;
//
//        for (a = 2; a < 10; a++) {
//            if (a % 2 == 0) {
//                for (b = 1; b < 10; b++) {
//                    sum = a * b;
//                    System.out.println(a + "*" + b + "=" + a*b);
//                }
//            System.out.println("===========");
//            }
//        }

        // 연습문제 : 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하시오.
//        int dan = 0;
//        int time = 0;
//        int result;
//
//        for (dan = 2; dan < 10; dan++) {
//            for (time = 1; time < 10; time++) {
//                if (time > dan) {
//                    break;
//                }
//                System.out.println(dan + "*" + time + "=" + dan * time);
//            }
//        }

        // 반복문을 사용하여 '*'를 모양을 출력하시오

//        int star = 0;
//
//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j < 6; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // 반복문을 사용하여 '*'을 1개씩 증가하도록 출력하시오.
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.println("");
//        }

        // 연습문제
        /*
        반복문을 사용하여 * 모양을 출력하시오
            *
           ***
          *****
         *******
         */
//        int lineCount = 4;
//        int spaceCount = lineCount / 2 + 1;
//        int starCount = 1;
//
//        for (int i = 0; i < lineCount; i++) {
//            for (int j = 0; j < spaceCount; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < starCount; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < spaceCount; j++) {
//                System.out.print(" ");
//            }
//            spaceCount -= 1;
//            starCount += 2;
//            System.out.println();
//        }

        // 연습문제
        /*
        반복문을 사용하여 * 모양을 출력하시오
            *
           ***
          *****
         *******
          *****
           ***
            *
         */
        int lineCount = 9;
        int spaceCount = lineCount/2 + 1;
        int starCount = 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }

            if (i < lineCount / 2) {
                spaceCount -= 1;
                starCount += 2;
            } else {
                spaceCount += 1;
                starCount -= 2;
            }
            System.out.println();
        }
    }
}
