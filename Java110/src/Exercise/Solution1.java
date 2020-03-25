package Exercise;
import java.util.Scanner;
public class Solution1 {
    public double Power(double base, int exponent) {
        if(base==0) return 0;
        if(exponent==0) return 1;
        if(exponent<0){
            exponent*=-1;
            base=1/base;
        }
        double b=base;
        for(int i=1;i<exponent;i++){
            base*=b;
        }
        return base;
    }
}

