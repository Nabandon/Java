package Solution1;

import Solution2.TreeNode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;


public class Java_0402 {
    public static void main(String[] args) {

    }
    private int baoS(String s,String b){
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(char c:b.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return  count;
    }
    private int efSerch(int[] arr,int k){
        int left=0;
        int right=arr.length;
        while(left<=right){
            int mind=left+(right-left)/2;
            if(arr[mind]<k){
                left=mind+1;
            }else if(arr[mind]>k){
                right=mind-1;
            }else{
                return  mind;
            }

        }
        return -1;
    }
}
