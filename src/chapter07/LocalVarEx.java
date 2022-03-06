package chapter07;

public class LocalVarEx {
    public static void main(String[] args) {

        Local local = new Local();
        local.process(); // 홍길동
        System.out.println(local.name);
        local.printAge1();
        local.printAge2();
    }
}
