package chapter07;

public class FinalMain {
    public static void main(String[] args) {

        Final f = new Final();
        //f.number = 30; // 상수니까
        System.out.println(f.number);
        System.out.println(Final.PI);
        System.out.println(Math.PI);
    }
}
