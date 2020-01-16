package Java0112;

class Pivote2{
    public int pivoteIndex(int[] nums){
        int sum=0;
        int left_sum=0;
        for(int x:nums){
            sum+=x;
        }
        for(int i=0;i<nums.length;i++){
            if(2*left_sum==sum-nums[i]){
                return i;
            }else {
                left_sum+=nums[i];
            }
        }
        return -1;
    }
}
