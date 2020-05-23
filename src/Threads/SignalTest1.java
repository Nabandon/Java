package Threads;

import Solution007.SignalTest;

import java.util.ArrayList;

public class SignalTest1 {
    public ArrayList<ArrayList<Integer>> generate (int numRows) {

        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(numRows<1){
            return res;
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        res.add(list);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> t=res.get(i-1);
            ArrayList<Integer> list2=new ArrayList<>();
            list2.add(1);
            for(int j=0;j<t.size()-1;j++){
                list2.add(t.get(j)+t.get(j+1));
            }
            list2.add(1);
            res.add(list2);
        }
        return res;
    }
}
