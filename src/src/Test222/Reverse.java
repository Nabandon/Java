package Test222;

public class Reverse {
    public void reverse(int[] nums){
        int left=0;
        int right=nums.length;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
