package Java0112;

public class Pivote {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int result1=0;
            int result2=0;
            for(int left=0;left<i;left++){
                result1+=nums[left];
            }
            for(int right=nums.length-1;right>i;right--){
                result2+=nums[right];
            }
            if(result1==result2){
                return i;
            }
        }
        return -1;
    }
}
