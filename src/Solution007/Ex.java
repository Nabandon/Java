package Solution007;


import java.io.File;
import java.util.ArrayList;

public class Ex {


    public int[] multiply(int[] A) {
        int[] b=new int[A.length];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=0;i<A.length;i++){
            list.add(list.get(i)*A[i]);
            int res=list.get(i);
            for(int j=i+1;j<A.length;j++){
                res*=A[j];
            }
            b[i]=res;
        }
        return b;
    }
}
