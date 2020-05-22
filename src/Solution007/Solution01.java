package Solution007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution01 {

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle.size()<1){
            return 0;
        }
        for(int i=triangle.size()-1;i>0;i--){
            ArrayList<Integer> list=triangle.get(i-1);
            ArrayList<Integer> list2=triangle.get(i);
            for(int j=0;j<list.size();j++){
                int t=list.get(j);
                int t2=Math.min(list2.get(j),list2.get(j+1));
                list.set(j,t+t2);
            }
        }
        return triangle.get(0).get(0);
    }
}