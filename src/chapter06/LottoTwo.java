/*
 * lotto 다른 방식풀이
 */
package chapter06;

import java.util.Arrays;

public class LottoTwo {
    public static void main(String[] args) {

        int[] l = new int [6];

        while(true) {


            for(int i=0; i<l.length; i++) {
                l[i] = (int)(Math.random() * 45) + 1;
            }
            boolean insert = true;
            for(int i=0; i<6; i++) {
                for(int j=0; j<6; j++) {
                    if(i != j) {
                        if(l[i] == l[j]) {
                            insert = false;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(l));
            if(insert) {
                break;
            }
        }
        System.out.println(Arrays.toString(l));
    }
}
