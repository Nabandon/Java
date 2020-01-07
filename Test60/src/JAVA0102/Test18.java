package JAVA0102;

import java.util.Arrays;

public class Test18 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right&&arr[left]%2==0){
                left++;
            }
            while (left<right&&arr[right]%2!=0){
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
        System.out.println("newarr:"+ Arrays.toString(arr));
    }
}
