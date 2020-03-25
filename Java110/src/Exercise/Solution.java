package Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int JumpFloorII(int n) {
        if(n<=0) return 0;
        if(n==1||n==2) return n;
        else{
            return JumpFloorII(n-1)*2;
        }
    }
}
