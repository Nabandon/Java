package Java0112;
public class ThirdMax {
    private long MIN = Long.MIN_VALUE;
    public  int thirdMax(int[] nums) {
        int first= nums[0];
        long second = MIN;
        long third= MIN;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==first||nums[i]==second||nums[i]==third)
                continue;
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }if(nums[i]>second){
                third=second;
                second=nums[i];
            } else if(nums[i]>third){
                third=nums[i];
            }
        }
        if(third==MIN)
            return first;
        return (int)third;
    }
}

