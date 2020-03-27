package Test;

public class Solution {
    public int partitionDisjoint(int[] A) {
        if(A.length==2) return 1;
        int max=A[0] , leftmax=A[0] , index=0;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
            if(A[i]<leftmax){
                leftmax=max;
                index=i;
            }
        }
        return index+1;
    }
}
