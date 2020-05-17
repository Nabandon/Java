package Solution007;

import java.util.Arrays;
import java.util.Stack;

public class Solution01 {

    public int candy(int[] ratings) {
        int n=ratings.length;
        if(n==0 || ratings==null){
            return 0;
        }
        int[] t=new int[n];
        Arrays.fill(t,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                t[i]=t[i-1]+1;
            }
        }
        int sum=0;
        for(int i=n-1;i>0;i--){
            sum+=t[i];
            if(ratings[i]<ratings[i-1] && t[i]>=t[i-1]){
                t[i-1]=t[i]+1;
            }
        }
        sum+=t[0];
        return sum;
    }
}