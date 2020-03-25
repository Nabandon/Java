package Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int RectCover(int n) {
        if(n<=0) return 0;
        if(n==1||n==2||n==3) return n;
        else{
            return RectCover(n-1)+RectCover(n-2);
        }
    }
}
