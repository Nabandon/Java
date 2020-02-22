package Test100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Therr {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans=new ArrayList();
        int len=nums.length;
        if(nums==null||len<3) return ans;
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++){
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=len-1;
            while(l<r){
                int n=nums[i]+nums[l]+nums[r];
                if(n==0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r &&nums[l]==nums[l+1]) l++;
                    while(l<r &&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(n>0) r--;
                else if(n<0) l++;
            }
        }
        return ans;
    }
}
