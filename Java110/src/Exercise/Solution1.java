package Exercise;
import java.util.Scanner;
public class Solution1 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int q=0,h=1;
        for(int i=1;i<n;i++){
            int res=q+h;
            q=h;
            h=res;
        }
        return h;
    }
}

