package Solution2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class Test {
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num.length==0 || size<=0 || size>num.length){
            return list;
        }
        int i=0;
        if(size==num.length){
            max(num,i,num.length);
            return list;
        }

        for( i=0 ;i<=num.length-size ;i++){
            max(num,i,size+i);
        }

        return list;
    }
    private void max(int[] arr,int star,int end){
        int Max=arr[star];
        for(int i=star;i<end-1;i++){
            Max=Math.max(Max,arr[i+1]);
        }
        list.add(Max);
    }
    
}
