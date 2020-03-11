package Test222;

public class BinarySearch {
    public int binary(int[] nums,int find){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mind=(left+right)/2;
            if(nums[mind]<find){
                left=mind+1;
            }else if(nums[mind]>find){
                right=mind-1;
            }else {
                return mind;
            }
        }
        return -1;
    }
}
