package chapter15;

public class LambdaEx4 {
    public static void main(String[] args) {
        int sum = sum(1, 2);
//        System.out.println(sum);

//        LamdaInterface4 f4 = (x,y) -> {
//            return x * y;
//        };
        LamdaInterface4 f4 = (x,y) -> x + y;
        System.out.println(f4.cal(1,2));

        f4 = (x, y) -> x * y;
        System.out.println(f4.cal(10,20));
        f4 = (x, y) -> x / y;
        System.out.println(f4.cal(100,20));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    interface LamdaInterface4 {
        int cal(int x, int y);
    }
}
