/*
 * do ~ while문
 */
package chapter05;

public class DoWhileEx {
    public static void main(String[] args) {

        int i = 10;
        do {
            System.out.println("i=" + i);
        }while (i<10);

        while(true) {
            System.out.println("i=" + i);
            i--;
            if(i == 0) {
                break; // 첫 while문 빠져나가는것.
            }
        }
    }
}
