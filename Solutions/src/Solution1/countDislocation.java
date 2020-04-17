package Solution1;

import java.util.HashMap;
import java.util.Map;

public class countDislocation {
    public int countDislocation (int n, int[] cutIn) {
        int len=cutIn.length;
        if(len==0 || n<=1) return 0;
        int index=1;
        int ma=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=len-1;i>=0;i--){
            ma=Math.max(ma,cutIn[i]);
            if(!map.containsKey(cutIn[i])){
                map.put(cutIn[i],index++);
            }
        }
        int m=0;
        for(Integer in:map.keySet()){
            if(map.get(in)!=in){
                m++;
            }
        }
        return m+(n-map.size()-(n-ma));
    }
}
