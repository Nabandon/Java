package Test222;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class Zc {

    public static int superPow(int a, int[] b) {

        long c=0;
        for(int i=0;i<b.length;i++){
            c=c*10+b[i];
        }
        long m=a;
        long n=1;
        for(int j=0;j<c;j++){
            n*=m;
        }
        return (int)n%1337;
    }
}
