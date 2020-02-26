package Test100;

public class RemoveElement {
    public int remove(int[] nums,int val){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
