package Interview;

import java.util.ArrayList;

public class Test {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        if(array==null || array.length==0){
            return res;
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }else if(array[i]+array[j]<sum){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }
}
