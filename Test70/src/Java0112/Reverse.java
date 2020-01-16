package Java0112;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reserve(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reserve(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
    }
}
