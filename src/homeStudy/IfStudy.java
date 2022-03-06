package homeStudy;

public class IfStudy {
    public static void main(String[] args) {
        // 나이에 따라 다른문장 출력하기
//        int age = 7;
//        if(age > 8) {
//            System.out.println("학교에 다닙니다.");
//        }else {
//            System.out.println("학교에 다니지 않습니다.");
//        }

        // gender 변수 값이 'F'인 경우 여성입니다. 그렇지 않으면 남성입니다
//        char gender = 'F';
//
//        if(gender == 'F') {
//            System.out.println("여성입니다.");
//    }else {
//        System.out.println("남성입니다.");
//        }

        // 입장료 계산하기
//        int age = 0;
//        int charge = 0;
//
//        if(age<8) {
//            charge = 1000;
//            System.out.println("어린이 입니다.");
//        }else if(age < 14) {
//            charge = 2000;
//            System.out.println("초등학생입니다.");
//        }else if(age < 20) {
//            charge = 2500;
//            System.out.println("중.고등학생 입니다.");
//        }else {
//            charge = 3000;
//            System.out.println("일반인 입니다.");
//        }
//        System.out.println("입장료는 " + charge + "원 입니다");
//
        // 조건식을 조건 연산자 형태로 변경
        int score = 40;
        char grade = ' ';

        grade=(score > 20)? 'A' : 'B';
        System.out.println(grade);
    }
}
