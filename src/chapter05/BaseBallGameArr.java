package chapter05;

public class BaseBallGameArr {
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
//        int[] com = new int[3];
//        while (true) { // ~동안으로 많이쓰임
//            for (int i = 0; i < com.length; i++) { // 개수가 명확할때 많이 쓰임
//                com[i] = (int) (Math.random() * 9) + 1;
//
//            }
//            boolean isSame = isSame(com);
//            if (!isSame) {
//                break;
//            }
//        }
//        System.out.printf(Arrays.toString(com));
//        // user
//        int user[] = new int[3];
//        Scanner sc = new Scanner(System.in);
//
//        int count = 0;
//
//        while (true) {
//            count++;
//            System.out.println("3자리 중복없이 숫자 넣기 >> ");
//            for (int i = 0; i < user.length; i++) {
//                user[i] = sc.nextInt(); //124
//
//            }
//        }
//        while (true) {
//            boolean isSame = user[0] == user[1] || user[0] == user[2] || user[1] == user[2];
//            if (!isSame) {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(user));
        // ball
//        int strike = 0;
//        int ball = 0;
//        int out = 0;
//
//        // com1
//        for (int i = 0; i < com.length; i++) {
//            for (int j = 0; j < user.length; j++) {
////				System.out.printf("[%s, %s]\n",com[i],user[j]);
//                if (com[i] == user[j]) {
//                    if (i == j) { // strike
//                        strike++;
//                    } else { // ball
//                        ball++;
//                    }
//                } else {
////					out++;
//                }
//            }
//            System.out.printf("%sS %sB %sO \n", strike, ball, out);
//        }
//        out = 3 - (strike + ball);
//
//        System.out.printf("%sS : %sB : %sO \n", strike, ball, out);
//
//        if (strike == 3) {
//            System.out.println(count + "번 빙고!!!!");
////            break;
//        }
//
//    }// end main
//
////	private static boolean isSame(int[] com) {
////	}
//
//    public static boolean isSame(int[] x) {
//        boolean rs = false;
////		int[] x = new int[0];
//        rs = x[0] == x[1] || x[0] == x[2] || x[1] == x[2];
//        return rs; // true
//    }
//
//    public static boolean isSame(int i, int i1, int i2) {
//        boolean rs = false;
//        Object x1 = null;
//        Object x2 = null;
//        Object x3 = null;
//        rs = x1 == x2 || x1 == x3 || x2 == x3;
//        return rs; // true
    }
}
