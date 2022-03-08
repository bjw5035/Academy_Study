package chapter13;

public class GenericEx3 {
    public static void main(String[] args) {
        Generic2<String, Integer> gen1 = new Generic2<String, Integer>();
        gen1.set("홍길동", 1111);
        System.out.println("name: " + gen1.getName());
        System.out.println("id: " + gen1.getId());
    }
}
