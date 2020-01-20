package Java0112;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
            int[] tar={-1,-1};
            int a;
            int b;
            for( a=0;a<nums.length;a++){
                if(nums[a]==target){
                    tar[0]=a;
                    break;
                }
            }
            if(tar[0]==-1){
                return tar;
            }
            for(b=nums.length-1;b>=a;b--){
                if(nums[b]==target){
                    tar[1]=b;
                    break;
                }
            }
            return tar;
    }
}
