package chapter10;

public class StringEx9 {
    public static void main(String[] args) {
        String str1 = new String("abcd");
        String str2 = new String("abcd");
//        String str2 = "abcd";
//        System.out.println("str1=" + System.identityHashCode(str1));
//        System.out.println("str2=" + System.identityHashCode(str2));

        str1 = str1 + "efg";
//        System.out.println("str1=" + System.identityHashCode(str1));

//        long start = System.currentTimeMillis();
//        String str = "";
//        for (int i = 0; i < 1000000; i++) {
//            str += i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Time : " + (end-start)/1000);

        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end-start)/1000);
    }
}
