package Solution1;

import java.util.*;

public class Main{
    public int getSum (int n) {
        // write code here
        int res=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++){
                    res+=f(k);
                }
            }
        }
        return res;
    }
    private int f(int n){
        if(n==1 || n==2){
            return 1;
        }
        int pre=1;
        int cur=1;
        long sum=0;
        for(int i=3;i<=n;i++){
            sum=pre+cur;
            sum%=1000000007;
            pre=cur;
            cur=(int)sum;
        }
        return (int)sum;
    }
}