package Test;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
