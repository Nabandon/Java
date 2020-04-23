package Solution1;

import Solution2.TreeNode;

import java.util.*;

public class Test001 {
    public int waysToChange(int n) {
        if(n==0||n==1) return n;
        int[] fen={25,10,5,1};
        int mod=1000000007;
        int[] res=new int[n+1];
        res[0]=1;
        for(int i:fen){
            for(int j=i;j<=n;j++){
                res[j]=(res[j]+res[j-i])%mod;
            }
        }
        return res[n];
    }
}