/*
 * 배열
 */
package chapter06;

import java.util.Scanner;

public class ArrEx {
    public static void main(String[] args) {

        int a0 = 1;
        int a1 = 2;
        int a2 = 3;
        int a3 = 4;
        int a4 = 5;

        // 1. 같은 타입
        // 2. 타입[] 배열명;
        // 3. Index - int
        // 4. 반복문 사용하기
        int[] a = new int[10]; // 0,0,0,0,0 객체
//		System.out.println(Arrays.toString(a));
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        System.out.println(a.length);
        for(int i=0; i<a.length; i++) {
            a[i] = i+1;
        }
//		System.out.println(Arrays.toString(a));

        // 누적 sum 구하기
        int sum = 0;
        // 과거
        for(int i=0; i<11; i++) {
            System.out.println(i);
        }
        // 현재 - a[]는 언제든지 쓸수 있음
        sum = 0;
        for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
            sum = sum + a[i];
        }

        Scanner[] sc = new Scanner[5];
        for(int i=0; i<sc.length; i++) {
            sc[i] = new Scanner(System.in);
        }
//		int[] lotto = new int[45];
//		for(int i=0; i<45; i++) {
//			lotto[i] = i+1;
//		}
//		System.out.println(lotto[10]); // 11
    }
}
