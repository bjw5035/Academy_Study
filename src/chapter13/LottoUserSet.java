package chapter13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoUserSet {
    public static void main(String[] args) {
        Random n = new Random();
        Set lotto = new HashSet(); // 중복 불가,순서 없음
        while (true) { // 6개의 숫자가 만들어 질때까지
            int b = n.nextInt(45) + 1; // 1 ~ 45
            lotto.add(b);
            if (lotto.size() == 6) {
                break;
            }
        }
        System.out.println(lotto);
        Set lotto2 = new TreeSet(); // 정렬
        while (true) { // 6개의 숫자가 만들어 질때까지
            int b = n.nextInt(45) + 1; // 1 ~ 45
            lotto2.add(b);
            if (lotto2.size() == 6) {
                break;
            }
        }
        System.out.println(lotto2);
    }
}
