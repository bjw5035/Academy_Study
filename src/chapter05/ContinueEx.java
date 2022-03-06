/*
 * continue
 */
package chapter05;

public class ContinueEx {
    public static void main(String[] args) {

        // 1~10까지 5일때만 안찍고 싶다.
        for(int i=1; i< 11; i++) {
//			if(i != 5) {
            // if(i%2 == 1) { // 짝수만 찍을때
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
//		for(;;) {} // 무한반복
//		while(true) {} // 무한반복
//		do {} while(true) // 무한반복
    }
}
