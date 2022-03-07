package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        List list = new ArrayList(); // 10개 먼저 만들어 놓음
        list.add(1); // 0
        list.add("hong"); // 1
        list.add(true); // 2
        list.add(3.14f); // 3
        list.add('a'); // 4

        int o1 = (int)list.get(0);
        String o2 = (String)list.get(1);
        boolean o3 = (boolean)list.get(2);
        float o4 = (float)list.get(3);
        char o5 = (char)list.get(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
