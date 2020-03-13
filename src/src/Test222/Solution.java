package Test222;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        int[] arr={1, 3, 2, 0, 3};
        System.out.println(minimumValueAfterDispel(arr));
    }
    public static long minimumValueAfterDispel (int[] nums) {
        // write code here
        int sum=0;
        Arrays.sort(nums);
        int n=nums[nums.length/2];
        for(int i=nums.length/2;i<nums.length;i++){
            nums[i]-=n;
        }
        Arrays.sort(nums);
        int m=nums[nums.length/2];
        for(int i=nums.length/2;i<nums.length;i++){
            nums[i]-=m;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}



