package Test101;

import java.util.ArrayList;
import java.util.List;

public class Test010 {
    public int[][] findContinous(int target){
        int j=1;
        int i=1;
        int sum=0;
        List<int[]> res=new ArrayList<>();
        while(i<=target/2){
            if(sum<target){
                sum+=j;
                j++;
            }else if(sum>target){
                sum-=i;
                i++;
            }else{
                int[] arr=new int[j-i];
                for(int k=i;k<j;k++){
                    arr[k-i]=k;
                }
                res.add(arr);
                sum-=i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);

    }
}
