package Solution1;

import java.util.Arrays;

public class Continous {
    public int Sum_Solution(int n) {
        int res=n;
        boolean b=(n>0) && ((res+=Sum_Solution(n-1))>0);
        return res;
    }
}
