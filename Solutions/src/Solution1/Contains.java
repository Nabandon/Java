package Solution1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains {

    public int[] solve (int n, int m, int[] a, int[] x) {
        // write code here
        int[] res=new int[m];
        Arrays.sort(a);
        for(int i=0;i<m;i++){
            res[i]=dichotomy(a,x[i]);
        }
        return res;
    }
    private int dichotomy(int[] arr,int xm){
        int len=arr.length;
        int left=0;
        int right=len-1;
        while(left<right){
            int mind=left+(right-left)/2;
            if(arr[mind]==xm) return 0;
            else if(arr[mind]<xm) left=mind+1;
            else if(arr[mind]>xm) right=mind-1;
        }
        if(right==-1) return Math.abs(arr[0]-xm);
        if(left==len) return Math.abs(arr[len-1]-xm);
        int lmin=Math.abs(arr[left]-xm);
        int rmin=Math.abs(arr[right]-xm);
        return Math.min(lmin,rmin);
    }
}
