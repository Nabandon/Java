package Java0112;

public class Insert {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for( i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
