package chapter06;

import java.util.Arrays;

public class ArrArgs {
    // 배열을 입력받아 그 배열의 요소들을 2배하는 메서드
    public static void arr2xRef(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

    }

    public static int[] arr2xNew(int[] arr) {
        int[] arrNew = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i] * 2;
        }
        return arrNew;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        arr2xRef(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = arr2xNew(arr);
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.hashCode(arr));
        System.out.println(Arrays.hashCode(arr2));
    }
}