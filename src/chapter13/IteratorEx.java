package chapter13;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        // Collection => Iterator
        // Iterator 객체 선언
        Iterator it = null;

        List list = new ArrayList();
        Set set = new HashSet();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            set.add(i + 5);
        }
        System.out.println(list);
        System.out.println(set);

        it = list.iterator();
        iteratorPrint(it);

        it = set.iterator();
        iteratorPrint(it);

    }

    static void iteratorPrint(Iterator it) {
        while (it.hasNext()) {
//            System.out.println(it.next());
//            it.remove();
            int i = (int) it.next();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
