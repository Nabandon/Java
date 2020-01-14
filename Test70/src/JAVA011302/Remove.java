package JAVA011302;
class Move{
    public int remove(int[]nums,int val){
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
            }else{
            i++;
            }
        }
        return i;
    }
}
public class Remove {
}
