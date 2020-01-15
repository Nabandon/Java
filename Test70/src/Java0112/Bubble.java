package Java0112;
import java.util.Arrays;
public class Bubble {
     public static void main(String[] args) {
         int[] arr={1,2,13,4,5,6,7};
         bubbleSort(arr);
         System.out.println(Arrays.toString(arr));
     }
    public static void bubbleSort(int[] nums){
        int a=0;
        int b=nums.length-1;
        for(a=0;a<nums.length;a++){
            for(b=nums.length-1;b>a;b--){
                if(nums[b]<=nums[a]){
                    int tmp=nums[b];
                    nums[b]=nums[a];
                    nums[a]=tmp;
                }
            }
        }
    }
}
