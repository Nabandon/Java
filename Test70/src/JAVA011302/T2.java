package JAVA011302;

import java.util.Arrays;

class solution{
    public static void rotate1(int[] nums,int k){
        for(int i=0;i<k;i++){
            int pre=nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                int tmp=nums[j];
                nums[j]=pre;
                pre=tmp;
            }

        } System.out.println(Arrays.toString(nums));
    }
}
public class T2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=4;
        solution.rotate1(arr,k);

    }
}
