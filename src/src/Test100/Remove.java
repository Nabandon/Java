package Test100;

public class Remove {
    public int remove(int[] nums){
        if(nums.length==0||nums.length==1) return nums.length;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
