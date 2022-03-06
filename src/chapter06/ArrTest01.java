package chapter06;

public class ArrTest01 {
    public static void main(String[] args) {

        int[] score = {100, 88, 100, 100, 90};
        // 총점과 평균을 구해서 출력하시오.
        // 풀이 1
        // 강사님 풀이
        int sum = 0;
        float avg = 0F;

        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        avg = (float) sum / score.length;
        System.out.println(sum);
        System.out.println(avg);

        // 풀이 2
        sum = 0;
        avg = 0;
        for (int i : score) {
            sum = sum + i;
        }
        avg = (float) sum / score.length;
        System.out.println(sum);
        System.out.println(avg);

        // 내가 푸는중
//        for (int i = 0; i < score.length; i++) {
//            for(int j=0; j<score[0].l)
//            System.out.println(i);
//        }
    }
}
