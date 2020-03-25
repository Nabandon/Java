package Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
