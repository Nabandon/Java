package Exercise;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
       int x= a.length;
       a[0]=a[a.length-1];
        System.out.println(Arrays.toString(a));
    }
    public  int massage(int[] nums) {
        int len=nums.length;
        int time=0;

        int[] mm=maxx(nums);
        time+=mm[0];
        nums[mm[1]]=nums[nums.length-1];
        int[] n=Arrays.copyOfRange(nums,0,nums.length-1);
        return time;
    }
    private int[] maxx(int[] nums){
        int max=nums[0];
        int w=0;
        for (int i=0;i<nums.length-1;i++){
            max=nums[0];
            if(nums[i]<nums[i+1]){
                max=nums[i+1];
                w=i+1;
            }
        }
        return new int[]{max,w};
    }
    public int massage1(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            int c=Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;

    }
}
