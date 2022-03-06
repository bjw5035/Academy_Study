package chapter07;

public class OverLoading2 {
    public static void main(String[] args) {

        // 오버로딩 - Method 방법(같은 이름의 메소드를 한 클래스에 여러 개 정의 할 수 있는 기능)
        // 오버라이딩 - 상속
        Operator op = new Operator();
        op.multiply(10, 10.5);
    }
}
