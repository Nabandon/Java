package Solution007;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class Ex {
    public int longestConsecutive (int[] num) {
        // write code here
        int len=num.length;
        if(len<=1){
            return len;
        }
        int max=1;
        HashSet<Integer> set=new HashSet<>();
        for(int n:num){
            set.add(n);
        }
        for(int n:num){
            int t=1;
            if(set.remove(n)){

                int samll=n-1;
                int big=n+1;
                while(set.remove(samll)){
                    t++;
                    samll--;
                }
                while(set.remove(big)){
                    t++;
                    big++;
                }
            }
            max=Math.max(max,t);
        }
        return max;
    }
}
