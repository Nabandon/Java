package prejact;

public class Mesege {
    public int messageCount (int N) {
        // write code here
        if(N<5){
            return 0;
        }
        int[] dp=new int[N+1];
        dp[5]=1;
        for(int i=6;i<=N;i++){
            dp[i]=(dp[i-1]+dp[i-5])% 998244353 ;
        }
        return dp[N];
    }
}
