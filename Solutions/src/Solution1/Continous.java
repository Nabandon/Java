package Solution1;

import java.util.Arrays;

public class Continous {
    public int[] multiply(int[] A) {
        int[] b=new int[A.length];
        for(int i=0;i<b.length;i++){
            int res=1;
            for(int j=0;j<b.length;j++){
                if(j==i){
                    continue;
                }else{
                    res*=A[j];
                }
            }
            b[i]=res;
        }
        return b;
    }
}
