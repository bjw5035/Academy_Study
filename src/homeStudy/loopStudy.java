package homeStudy;

public class loopStudy {
    public static void main(String[] args) {

        // 반복문
        // num += 2;는 복합대입연산자, num = num + 2와 같다.
//        int num = 1;
//        num += 2;
//        num += 3;
//        num += 4;
//        num += 5;

        // 예제 : while문을 활용하여 1부터 10까지 구하기
//        int num = 5;
//        int sum = 0;
//
//        while(num <= 10) { // num이 10 보다 작거나 같을때
//            sum += num; // sum + num해서 sum에 값을 대입
//            num++; // s
//        }
//        System.out.println(sum);

//        예제 : 1부터 50까지 더하는 프로그램
//        int num = 1;
//        int sum = 0;
//
//        while (num < 51) {
//            sum += num;
//            num++;
//
//        }
//        System.out.println(sum);

        // do~while문 예제
//        int num = 1;
//        int sum = 0;
//
//        do {
//            sum += num;
//            num++;
//        } while (num <= 10);
//        System.out.println(sum);

        /*
        for문
        for(초기화식; 조건식; 증감식) {
            수행문;
        }
        */
        // for문 예제
//        int i = 0;
//        int sum = 0;
//
//        for(int i=0; i < 11; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        String s = "안녕하세요";
//        for(int i=1; i<11; i++) {
//            System.out.printf("%s%s\n", s,i);
//        }

        // 중첩된 반복문
//        int dan;
//        int times;
//
//        for (dan = 2; dan < 10; dan++) {
//            for (times = 1; times < 10; times++) {
//                System.out.println(dan + "X" + times + "=" + dan * times);
//            }
//            System.out.println(); // 한줄 띄어서 출력
//        }

// continue문 예제
//        int total = 0;
//        int num;
//
//        for (num = 1; num < 101; num++) {
//            if (num % 2 == 0) {
//                continue;
//            }
//            total += num;
//        }
//        System.out.println("1부터 100까지의 홀수의 합은 : " + total + "입니다.");

//        int num;
//
//        for (num = 3; num < 100; num++) {
//            if (num % 3 == 1) {
//                continue;
//            }
//            System.out.println(num);
//        }

    }
}
