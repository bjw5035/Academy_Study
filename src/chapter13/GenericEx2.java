package chapter13;

public class GenericEx2 {
    public static void main(String[] args) {
        Generic<String> gen = new Generic<String>();
        String[] ss = {"홍길동", "이순신", "김유신"};
        gen.set(ss);
        gen.print();

        Object[] objs = gen.get();
        for (Object o : objs) {
            String s = (String) o;
        }

        Integer[] ii = {1, 2, 3};
        Generic<Integer> gen2 = new Generic<Integer>();
        gen2.set(ii);
        Integer[] i = gen2.get();
        int sum = 0;
        for (Integer o : i) {
            sum += o;
        }
    }
}
