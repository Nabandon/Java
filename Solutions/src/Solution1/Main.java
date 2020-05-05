package Solution1;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        if(n==1){
            System.out.println(1);
            return ;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sca.nextInt();
        }
        int count=1;

        for(int j=0;j<n;j++){
            if(count>=n-j+1){
                break;
            }
            Set<Integer> set=new HashSet<>();
            int max=arr[j] , min=arr[j];
            set.add(arr[j]);
            for(int k=j+1 ;k<n;k++){
                if(set.contains(arr[k])){
                    break;
                }
                set.add(arr[k]);
                max=Math.max(max,arr[k]);
                min=Math.min(min,arr[k]);
                if(max-min==k-j){
                    count=Math.max(count,max-min+1);
                }
            }
        }
        System.out.println(count);

    }
}