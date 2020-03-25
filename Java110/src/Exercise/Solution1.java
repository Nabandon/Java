package Exercise;
import java.util.Scanner;
public class Solution1 {
    public int JumpFloor(int n) {
        if(n==0||n==1) return 1;
        if(n==2||n==3) return n;
        int q=2,h=3;
        for(int i=3;i<n;i++){
            int res=q+h;
            q=h;
            h=res;
        }
        return h;
    }
}

