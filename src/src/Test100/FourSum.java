package Test100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList();
        Arrays.sort(nums);
        int len=nums.length;
        if(len<4) return ans;
        for(int a=0;a<len-3;a++){
            if(a>0&&nums[a]==nums[a-1])
                continue;
            for(int b=a+1;b<len-2;b++){
                if(nums[b]==nums[b+1]) b++;
                int left=b+1;
                int right=len-1;
                while (left<right){
                    int n=nums[a]+nums[b]+nums[left]+nums[right];
                    if(n==target){
                        ans.add(Arrays.asList(nums[a],nums[b],nums[left],nums[right]));
                        while (left<right&&nums[left]==nums[left+1]) left++;
                        while (left<right&&nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                    if(n>target) right--;
                    if(n<target) left++;
                }
            }
        }
        return ans;
    }
}