package Exercise;

public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==0||n==1) return 1;
        if(n==2||n==3) return n;
        int first=2;
        int second=3;
        int sum=0;
        for(int i=4;i<=n;i++){
            sum=second+first;
            first=second;
            second=sum;

        }
        return sum;
    }
}
