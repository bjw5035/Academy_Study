package chapter06;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5}; //1000
        int[] arr2 = new int[10]; //2000

        // 기존값 복사
        for(int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));

        // arraycopy()
        int[] arr3 = new int[10];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        // copeOf()
        int[] arr4 = null;
        arr4 = Arrays.copyOf(arr1, arr1.length+5);
    }
}
