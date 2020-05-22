package Solution007;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class Ex {

    public ArrayList<Integer> getRow (int rowIndex) {

        ArrayList<Integer> list=new ArrayList<>();
        if(rowIndex<0) {
            return list;
        }

        list.add(1);
        for(int i=0;i<rowIndex;i++){

            for(int j=i;j>0;j--){

                int pre=list.get(j-1);
                int cur=list.get(j);
                list.set(j,pre+cur);
            }
            list.add(1);
        }
        return list;
    }
}
