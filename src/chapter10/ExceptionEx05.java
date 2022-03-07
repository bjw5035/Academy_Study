package chapter10;

import java.util.ArrayList;

public class ExceptionEx05 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        int[] arr = new int[3];
        ArrayList list = new ArrayList();
        try {
            System.out.println(3);
//            System.out.println(0 / 0);
//            arr[3] = 10;
            list.add("100");
            System.out.println(4);  // 실행되지 않는다.
        } catch (NullPointerException e) {
            e.printStackTrace(); // 많이 쓰임
            System.out.println(e.getMessage());
//            System.out.println("NullPointerException");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }catch (Exception e) {
            System.out.println(6);
        } finally {
            System.out.println(); // 무조건 실행됨
        } // try-catch의 끝
        System.out.println(7);
    }   // main메서드의 끝
}
