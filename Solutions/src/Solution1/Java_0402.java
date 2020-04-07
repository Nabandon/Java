package Solution1;

import Solution2.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Java_0402 {

    public boolean VerifySquenceOfBST(int [] sequence) {
        int len=sequence.length;
        if(len==0) return false;
        if(len==1) return true;
        return helper(sequence,0,len-1);
    }
    private boolean helper(int[] arr,int start,int end){
        if(end<=start) return true;
        int i=start;
        for(;i<end;i++){
            if(arr[i]>arr[end]){
                break;
            }
        }
        for(int j=i;j<end;j++){
            if(arr[j]<arr[end]){
                return false;
            }
        }
        return helper(arr,0,i-1)&&helper(arr,i,end-1);
    }

}
