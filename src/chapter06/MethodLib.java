package chapter06;

public class MethodLib {
    // 전체는 멤버 메서드

    // 전역 메서드(static이 있을때)
    public static char intTochar(int a) {
        char c = ' ';
        c = (char)a;
        return c;
    }

    // 인스턴스 메서드(static이 없을때), (힙에다 만들때 사용가능)
    public String intToString(int a) {
        String s = "";
        s = a+"";
        return s;
    }
}
