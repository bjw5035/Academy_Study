package chapter10;

import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        Random r = new Random();
        // nextInt() : 0이상 n미만
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(6)); // 0이상 6 미만
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextBoolean());
        }

        for (int i = 0; i < 5; i++) { // 평균 0, 분산 1
            System.out.println(r.nextGaussian());
        }
    }
}
