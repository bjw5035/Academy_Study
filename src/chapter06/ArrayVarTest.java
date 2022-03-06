package chapter06;

public class ArrayVarTest {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;

        arr1[0] = 10;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

        arr1[0] = 100;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
