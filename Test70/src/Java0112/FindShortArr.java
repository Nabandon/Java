package Java0112;

public class FindShortArr {
    public static int findUnsortedSubarray(int[] nums) {
    int left=nums.length;int right=0;
    for(int a=0;a<nums.length-1;a++){
        for(int b=a+1;b<nums.length;b++){
            if(nums[b]<nums[a]){
                right=Math.max(right,b);
                left=Math.min(left,a);
            }
        }
    }
    return right-left<0? 0:right-left+1;
    }
}
