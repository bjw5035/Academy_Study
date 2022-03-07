package chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        // Collection => Iterator
        // Iterator 객체 선언
        Iterator it = null;

        List list = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        it = list.iterator();
        iteratorPrint(it);

    }

    static void iteratorPrint(Iterator it) {
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
    }
}
