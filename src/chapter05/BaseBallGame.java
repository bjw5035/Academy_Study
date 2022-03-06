package chapter05;

import java.util.Scanner;

public class BaseBallGame {
    public static void main(String[] args) {

        /*
		com : 3자리  1 2 3
		user : 3자리 1 3 4
		규칙 : 자리와 숫자가 같으면 S, 숫자만 있으면 B, 없는 숫자 O
		1S 1B 1O
		종료조건 : 3S 탈출
		단, com, user 의 숫자는 중복되면 안됨 //???
		*/
        // com
        int com1 = 0;
        int com2 = 0;
        int com3 = 0;
        while(true) {
            com1 = (int)(Math.random()*9) + 1;
            com2 = (int)(Math.random()*9) + 1;
            com3 = (int)(Math.random()*9) + 1;
            boolean isSame = com1 == com2 || com1 == com3 || com2 == com3;
            if(!isSame) {
                break;
            }
        }
        System.out.printf("com: %s %s %s\n",com1,com2,com3);
        // user
        int user1 = 0;
        int user2 = 0;
        int user3 = 0;
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(true) {
            count++;
            while(true) {
                System.out.println("3자리 중복없이 숫자 넣기 >> ");
                String user = sc.next(); //124
                user1 = Integer.parseInt(user.charAt(0)+"");
                user2 = Integer.parseInt(user.charAt(1)+"");
                user3 = Integer.parseInt(user.charAt(2)+"");
                boolean isSame = user1 == user2 || user1 == user3 || user2 == user3;
                if(!isSame) {
                    break;
                }
            }
            System.out.printf("user: %s %s %s\n",user1,user2,user3);
            // ball
            int strike = 0;
            int ball = 0;
            int out = 0;

            if(com1 == user1) {// S
                strike++;
            }else if(com1 == user2) {
                ball++;
            }else if(com1 == user3) {
                ball++;
            }else {
                out++;
            }

            if(com2 == user1) {// S
                ball++;
            }else if(com2 == user2) {
                strike++;
            }else if(com2 == user3) {
                ball++;
            }else {
                out++;
            }

            if(com3 == user1) {// S
                ball++;
            }else if(com3 == user2) {
                ball++;
            }else if(com3 == user3) {
                strike++;
            }else {
                out++;
            }

            System.out.printf("%sS : %sB : %sO \n",strike,ball,out);

            if(strike==3) {
                System.out.println(count + "번 빙고!!!!");
                break;
            }
        }

    }// end main

//	public static boolean isSame(int i, int i1, int i2) {
//		boolean rs = false;
//		rs = x1 == x2 || x1 == x3 || x2 == x3;
//		return rs; // true
//	}
//	public static boolean isSame(int i, int i1, int i2) {
//		boolean rs = false;
//		rs = x1 == x2 || x1 == x3 || x2 == x3;
//		return rs; // true
//	}
}
