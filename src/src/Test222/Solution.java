package Test222;

import java.util.Arrays;

class Solution{
    public static void main(String[] args) {

    }
    public boolean find132pattern(int[] nums) {
        if(nums.length<3) return false;
        int i=nums[0];
        for(int j=1;j<nums.length-1;j++){
            if(nums[j]>i){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k]>i&&nums[k]<nums[j]){
                        return true;
                    }
                }
            }else{
                i=nums[j];
            }
        }
        return false;
   }
}
