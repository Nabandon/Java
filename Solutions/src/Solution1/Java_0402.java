package Solution1;

import Solution2.TreeNode;

import java.util.*;


public class Java_0402 {
    public static void main(String[] args) {
    }
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i:nums){
            res^=i;
        }
        return res;
    }

}
