package Test222;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        int fre=nums.length/2;
        int size=0;
        for(int i=0;i<nums.length-1;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count > fre) {
                        size = nums[i];
                    }
                }
            }
        }
       return size;
    }
}



