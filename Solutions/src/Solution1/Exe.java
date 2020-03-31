package Solution1;

import java.util.*;


public class Exe {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        Queue<Integer> dog=new LinkedList<>();
        Queue<Integer> cat=new LinkedList<>();
        Queue<Integer> all=new LinkedList<>();
        ArrayList<Integer> animal=new ArrayList<>();
        for(int i=0;i<ope.length;i++){
            if(ope[i][0]==1){
                if(ope[i][1]<0){
                    cat.offer(ope[i][1]);
                }else if(ope[i][1]>0){
                    dog.offer(ope[i][1]);
                }
                all.offer(ope[i][1]);
            }
            if(ope[i][0]==2){
                if(ope[i][1]==0 && !all.isEmpty()){
                    int temp=all.poll();
                    animal.add(temp);
                    if(temp<0){
                        cat.poll();
                    }else if(temp>0){
                        dog.poll();
                    }

                }else if(ope[i][1]==1 && !dog.isEmpty()){
                    Integer tem=dog.poll();
                    animal.add(tem);
                    all.remove(tem);
                }else if(ope[i][1]==-1 && !cat.isEmpty()){
                    Integer temc=cat.poll();
                    animal.add(temc);
                    all.remove(temc);
                }
            }
        }
        return animal;
    }
}
