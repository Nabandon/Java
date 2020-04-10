package Solution1;

import Solution2.TreeNode;

import java.util.*;


public class Java_0402 {
    public static void main(String[] args) {
        int[] a={4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(a,4));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        int len=input.length;
        if(len==0||len<k||k<=0) return res;
        creatHeap(input,k);
        for(int i=k;i<len;i++){
            if(input[i]<input[0]){
                input[0]=input[i];
                shiftDown(input,k,0);
            }
        }
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }
    private static void creatHeap(int[] arr,int k){
        for(int i=(k-2)/2;i>=0;i--){
            shiftDown(arr,k,i);
        }
    }
    private static void shiftDown(int [] arr,int size,int index){
        int parent=index;
        int child=2*parent+1;
        while(child<size){
            if(child+1<size&&arr[child]<arr[child+1]){
                child=child+1;
            }
            if(arr[child]>arr[parent]){
                int tem=arr[child];
                arr[child]=arr[parent];
                arr[parent]=tem;
            }else{
                break;
            }
            parent=child;
            child=2*parent+1;
        }
    }

}
