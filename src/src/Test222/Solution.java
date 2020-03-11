package Test222;

import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        
    }
public boolean find132pattern(int[] nums) {
        if(nums.length<3) return false;
        int a=0,b=1,c=2,n=nums.length;
        for(a=0;a<n-2;a++){
        for(b=a+1;b<n-1;b++){
        for(c=b+1;c<n;c++){
        if(nums[a]<nums[c]&&nums[c]<nums[b]){
            return true;
        }
        }
        }
        }
        return false;
   }
}
