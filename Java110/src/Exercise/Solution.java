package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows<=0) return res;
        List<Integer> internal=new ArrayList<>();
        internal.add(1);
        res.add(internal);
        for(int i=1;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            list.add(1);
            res.add(list);
        }
        return res;
    }
}
