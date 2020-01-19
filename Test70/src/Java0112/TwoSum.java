package Java0112;

public class TwoSum {
    public int[] twoSum(int[] nums ,int target){
        int a;
        int b;
        for(a=0;a<nums.length-1;a++){
            for(b=1+a;b<nums.length;b++){
                int sum=nums[a]+nums[b];
                if(sum==target){
                    return new int[] {a,b};
                }
            }
        }
        return  new int[]{-1};
    }
}
