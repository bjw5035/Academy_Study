package chapter03;

public class CastingEx {
    public static void main(String[] args) {
        // 자동형변환 예시
        int number = 10;	// int 자료형
        long number2 = number;	// 자동형변환 int < long
        float number3 = number2;	// 자동형변환 long < float
        double number4 = number3;	// 자동형변환 float < double

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }
}
