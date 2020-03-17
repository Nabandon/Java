package Test222;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Water {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==4) return true;
        long n=num/2;
        long m=0;
        while(n*n>num){
            m=n;
            n/=2;
        }
        for(;n<=m;n++){
            if(n*n==num){
                return true;
            }
        }
        return false;
    }
}
