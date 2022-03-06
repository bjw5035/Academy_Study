/*
 * 중첩 if문
 */
package chapter05;

public class IfEx3 {
    public static void main(String[] args) {

        int math = 90;
        int eng = 95;
        int kor = 50;
        boolean b = math > 60 && eng >= 60 && kor >= 60;

        // 중첩 if문
        if (math >= 60) {
            if (eng >= 60) {
                System.out.println("통과");
            }
        } else {
            System.out.println("탈락");
        }

        // 중첩 => 논리식
        if (math >= 60 && eng >= 60) {
            System.out.println("통과");
        } else {
            System.out.println("탈락");
        }

        // 중첩
        if (math >= 60) {
            if(eng >= 60) {
                if(kor >= 60) {
                    System.out.println("통과");
                } else {
                    System.out.println("탈락");
                }
            } else {
                System.out.println("탈락");
            }
        } else {
            System.out.println("탈락");
        }

        if(math >= 60) {
            System.out.println("통과");
        } else if(eng >= 60) {
            System.out.println("통과");
        } else if(kor >= 60) {
            System.out.println("통과");
        } else {
            System.out.println("탈락");
        }
    }
}
