package memberArray;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("hong1");
        list1.add("hong2");

        List<String> list2 = list1;
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
