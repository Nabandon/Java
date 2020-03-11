package Test222;

public class Max {
    public void max(int[] nums){
        for(int bound=0;bound<nums.length;bound++){
            for(int cur=nums.length-1;cur>bound;cur--){
                if(nums[cur]<nums[cur-1]){
                    int temp=nums[cur];
                    nums[cur]=nums[cur-1];
                    nums[cur]=temp;
                }
            }
        }
    }
}
