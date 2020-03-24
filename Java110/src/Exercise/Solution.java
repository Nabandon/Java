package Exercise;

import java.util.Arrays;

public class Solution {
    public int[] smallestK(int[] arr, int k) {

        Arrays.sort(arr);
        int[] nums=new int[k];
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}
