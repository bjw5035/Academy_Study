package chapter13;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
        int[] nums = {1234, 4567, 2350, 9870, 2345};

        // pub(Key, Value)
        for(int i=0;i<names.length; i++) {
            map.put(names[i],nums[i]);
        }

        // keySet()
        Set keys = map.keySet();
        for (Object o : keys) {
            System.out.print(o+":");
            System.out.println(o + ":" + map.get(o));
        }

        System.out.println("=====================");
        // Set => Iterator로 변환 사용법
        Iterator it = keys.iterator();
        while (it.hasNext()) {
//            System.out.print(it.next()+":");
            Object o = it.next();
            System.out.print(o+":");
            System.out.println(map.get(o));
        }

        // Value sum(누적하기)
        int sum = 0;
        for (Object o : keys) {
            int v = (int) map.get(o);
            sum += v;
            System.out.println(o+":"+v+":"+sum);
        }

        // Map Values()메소드가 있음
        sum = 0;
        Collection values = map.values();
        for (Object o : values) {
//            System.out.println(o);
            int v = (int) o;
            sum += v;
        }

        sum = 0;
        it = values.iterator();
        while (it.hasNext()) {
            int v = (int) it.next();
            sum += v;
        }

        // key, value => entrySet() => Map.Entry로 변환
        // getKey(), getValue()
        Set entry = map.entrySet();
        for (Object o : entry) {
            Map.Entry me = (Map.Entry)o;
            int v = (int) me.getValue();
            sum += v;
//            Object key = me.getKey();
//            System.out.println(me.getKey());
//            System.out.println(me.getValue());
//            System.out.println(map.get(me.getKey()));
        }


    }
}
