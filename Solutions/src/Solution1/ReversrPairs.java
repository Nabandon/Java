package Solution1;

import java.util.Arrays;
import java.util.HashMap;

public class ReversrPairs {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        int[] n=new int[2];
        int index=0;
        for(int i:array){
            if(map.get(i)==1){
                n[index++]=i;
            }
        }
        num1[0]=n[0];
        num2[0]=n[1];
    }
}
