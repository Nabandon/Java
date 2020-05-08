package Solution1;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] interest=new int[n];
        int[] boo=new int[n];
        for(int i=0;i<n;i++){
            interest[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boo[i]=sc.nextInt();
        }
        long sum=0;
        for(int i=0;i<n;i++){
            if(boo[i]==1){
                sum+=interest[i];
            }
        }
        long max=0;
        for(int i=0;i<n;i++){
            int tem=0;
            int j=i;
            int k1=k;
            if(boo[i]==0){

                while(k1>0  ){
                    if(j<n && boo[j]==0){
                        tem+=interest[j];
                    }
                    j++;
                    k1--;
                }
            }
            max=Math.max(max,tem);
            if(j>=n){
                break;
            }
        }
        System.out.println(sum+max);
    }
}