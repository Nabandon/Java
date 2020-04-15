package Solution1;

import Solution2.TreeNode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;


public class Java_0402 {
    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words,int k){
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(o1,o2)->{
            int count1=map.get(o1);
            int count2=map.get(o2);
            if(count1==count2){
                return o1.compareTo(o2);
            }
            return count2-count1;
        });
        return  list.subList(0,k);
    }
    public String[] findRelativeRanks(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        String[] str=new String[n];
        int j=n-1;
        for(int k=0;k<n;k++){
            if(j>=0){
                if(j==n-1){
                    str[map.get(nums[j])]="Gold Medal";
                }else if(j==n-2){
                    str[map.get(nums[j])]="Silver Medal";
                }else if(j==n-3){
                    str[map.get(nums[j])]="Bronze Medal";
                }else{
                    str[map.get(nums[j])]=String.valueOf(k+1);
                }
                j--;
            }
        }
        return str;
    }
}
