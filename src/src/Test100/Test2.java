package Test100;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i=0;i<arr.length;i++) {
        arr[i]*=2;
        }
        System.out.print(Arrays.toString(arr));
    }
}
