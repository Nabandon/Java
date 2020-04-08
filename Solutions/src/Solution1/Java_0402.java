package Solution1;

import Solution2.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Java_0402 {

    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len==0) return 0;
        if(len==1) return array[0];
        int n=len/2;
        Arrays.sort(array);
        int x=array[n];
        int count=0;
        for(int i=0;i<len;i++){
            if(array[i]==x){
                count++;
            }
        }
        return count>n?x:0;
    }

}
