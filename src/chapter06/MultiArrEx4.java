/*
단어 맞추기
 */
package chapter06;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {

        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"imteger", "정수"},
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
            String tmp = sc.nextLine();
            if (tmp.equals(words[i][1])) {
                System.out.println("빙고!!");
            } else {
                System.out.printf("틀렸습니다. 정답 : %s \n",words[i][1]);
            }
        }
    }
}
