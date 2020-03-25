package Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        Arrays.sort(array);
        return array[0];
    }
}
