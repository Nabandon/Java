package Solution1;

import java.util.HashSet;
import java.util.Set;

public class Contains {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
//                    return true;
//                }
//            }
//        }
//        return false;
        if(k<=0) return false;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
