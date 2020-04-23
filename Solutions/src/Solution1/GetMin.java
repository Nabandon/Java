package Solution1;

import java.util.HashMap;

public class GetMin {
    public long IncreasingArray (int[] array) {
        if(array.length==1) return 0;
        // write code here

        long count=0;
        for(int i=1;i<array.length;i++){
            if(array[i]<=array[i-1]){
                count+=array[i-1]-array[i]+1;
            }
        }
        return count;
    }
}
