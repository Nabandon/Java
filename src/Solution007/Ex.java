package Solution007;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class Ex {

    public int maxProfit1 (int[] prices) {

        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                res+=(prices[i]-prices[i-1]);
            }
        }
        return res;
    }

    public int maxProfit2 (int[] prices) {

        if(prices.length<=1){
            return 0;
        }
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
