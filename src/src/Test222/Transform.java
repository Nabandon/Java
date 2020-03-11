package Test222;

public class Transform {
    private void transform(int[] nums){
        int left=0;
        int right=nums.length;
        while(left<right){
            while (left<right&&nums[left]%2==0){
                left++;
            }
            while (left<right&& nums[right]%2!=0){
                right--;
            }
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }
    }
}
