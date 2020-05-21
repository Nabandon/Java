package Solution007;

import java.util.Arrays;
import java.util.Stack;

public class Solution01 {

    public int maxProfit (int[] prices) {
        // write code here
        int len=prices.length;
        if(len<2){
            return 0;
        }
        int[] pre=new int[len];
        int[] post=new int[len];
        int min=prices[0];
        for(int i=1;i<len;i++){
            min=Math.min(min,prices[i]);
            pre[i]=Math.max(pre[i-1],prices[i]-min);
        }
        int max=prices[len-1];
        for(int i=len-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            post[i]=Math.max(max-prices[i],post[i+1]);
        }
        int res=0;
        for(int i=0;i<len;i++){
            res=Math.max(res,post[i]+pre[i]);
        }
        return res;
    }
}