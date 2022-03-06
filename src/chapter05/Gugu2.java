package chapter05;

public class Gugu2 {
    public static void main(String[] args) {

        /*
         * 2 * 1 = 2
         * 2 * 2 = 4
         * ...
         *
         * 3 * 1 = 3
         * 3 * 2 = 6
         * ...
         *
         * 9 * 1 = 9
         * 9 * 2 = 18
         */

//		int dan = 1;

        for(int j=2; j<10; j++) {

//			dan++;
            System.out.println("=== " + j + "단 ===");
            for(int i=1; i<10; i++) {
                System.out.printf("%s * %s = %s \n", j,i, j*i);
            }
        }

//		dan++;
//		System.out.println("=== " + dan + "단 ===");
//		for(int i=1; i<10; i++) {
//			System.out.printf("%s * %s = %s \n", dan,i, dan*i);
//		}
    }
}
