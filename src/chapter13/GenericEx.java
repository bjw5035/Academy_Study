package chapter13;

public class GenericEx {
    public static void main(String[] args) {
        NoGeneric nogen = new NoGeneric();
        String[] ss = {"홍길동", "이순신", "김유신"};
        nogen.set(ss);

        Object[] objs = nogen.get();
        for (Object o : objs) {
            String s = (String) o;
        }

        Integer[] ii = {1, 2, 3};
        nogen.set(ii);
        objs = nogen.get();
        for (Object o : objs) {
            String s = (String) o;
            System.out.println(s.trim());
        }
    }
}
