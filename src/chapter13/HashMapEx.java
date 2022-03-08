package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map map = new HashMap();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
        int[] nums = {1234, 4567, 2350, 9870, 2345};

        // pub(Key, Value)
        for(int i=0;i<names.length; i++) {
            map.put(names[i],nums[i]);
        }

        // key
        int sum = 0;
        Set<String> keys = map2.keySet();
        for (String k : keys) {
            int v = map2.get(k);
            sum += v;
        }

        // sum
//        int sum = 0;
        Collection<Integer> values = map2.values();
        for (int v : values) {
            sum += v;
        }

        // get(Key)
        System.out.println(map.get("홍길동")); // 1234
        System.out.println(map.get("강감찬")); // 9870이 나옴

    }

}
