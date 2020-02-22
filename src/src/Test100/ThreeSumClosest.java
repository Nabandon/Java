package Test100;

import java.util.Arrays;

public class ThreeSumClosest {
    public int tSc(int[] nums,int target){
        Arrays.sort(nums);
        int len=nums.length;
        int ans=nums[1]+nums[2]+nums[3];
        for(int i=0;i<len;i++){
            int  l=i+1;
            int  r=len-1;
            while(l<r){
            int n=nums[i]+nums[l]+nums[r];
                if(Math.abs(ans-target)>Math.abs(n-target))
                    ans=n;
                if(n>target) r--;
                if(n<target) l++;
                if(n==target) return ans;
            }
        }
        return ans;
    }
}
