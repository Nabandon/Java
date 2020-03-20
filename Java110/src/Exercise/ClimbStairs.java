package Exercise;

public class ClimbStairs {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if(n==0||n==1) return  n;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        for(int len=2;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j]=Math.max(dp[i][j],dp[i+1][j-1]+2);
                }
            }
        }
        return dp[0][n-1];
    }

}
