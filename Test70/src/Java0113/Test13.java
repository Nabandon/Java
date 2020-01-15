package Java0113;

import java.util.Arrays;

public class Test13 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        solution.rotate(nums,3);

        System.out.println(Arrays.toString(nums));
        System.out.println(remove1.removeElement(nums,3));
    }
}
class solution{
    public static void rotate(int[] nums,int k){
        int pre;
        for(int i=0;i<k;i++){
            pre=nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                int tmp=nums[j];
                nums[j]=pre;
                pre=tmp;
            }
        }
    }
}
class remove{
    public static int removeEnlement(int[] nums,int val){
            int size=nums.length;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    size--;
                }
            }return size;
    }
}
class remove1{
    public  static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            }
            i++;
        }
        return n;
    }
}
