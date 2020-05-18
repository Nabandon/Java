package Solution007;

public class RandomListNode {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len=gas.length;
        if(len==0){
            return -1;
        }

        int start=len-1;
        int end=0;
        int res=gas[start]-cost[start] ;
        while(start>end){
            if(res>=0){
                res+=gas[end]-cost[end];
                end++;
            }else{
                start--;
                res+=gas[start]-cost[start];
            }
        }
        return res>=0?start:-1;
    }
}
