package Solution1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringFre {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > a=new ArrayList<>();
        a=FindContinuousSequence(15);
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                System.out.println(a.get(i).get(j));
            }
        }
    }
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(sum<3) {
            return res;
        }
        ArrayList<Integer> list =new ArrayList<>();
        int i=1;
        int count=0;
        while(i<=(sum/2+1)){
            if((count+i)<sum){
                list.add(i);
                count+=i;
                i++;
            }else if((count+i)==sum){
                list.add(i);
                count+=i;
                res.add(new ArrayList<>(list));
                count-=list.get(0);
                list.remove(0);
                i++;
            }else {
                while((count+i)>sum) {
                    count -= list.get(0);
                    list.remove(0);
                }
                if((count+i)==sum){
                    list.add(i);
                    count+=i;
                    res.add(new ArrayList<>(list));
                    count-=list.get(0);
                    list.remove(0);

                }else {
                    count+=i;
                    list.add(i);
                }
                i++;
            }
        }
        return  res;
    }
    //
    public ArrayList<ArrayList<Integer> > FindContinuousSequence1(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(sum<3) {
            return res;
        }
        for(int i=1;i<=(sum/2+1);i++){
            ArrayList<Integer> list=new ArrayList<>();
            int num=0;
            for(int j=i;j<=(sum/2+1);j++){
                num+=j;
                list.add(j);
                if(num==sum){
                    res.add(list);
                    break;
                }
                if(num>sum){
                    break;
                }
            }
        }
        return res;
    }
}
