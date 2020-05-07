package Solution1;


import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int w=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum<=w){
            System.out.println((int)Math.pow(2,n));
            return ;
        }else{
            System.out.println(loop(arr,n-1,w));
        }
    }
    private static int loop(int[] arr,int i,int w){
        if(i==0){
            if(w>=arr[0]){
                return 2;
            }else{
                return 1;
            }
        }
        if(w<=0){
            return 1;
        }
        if(w-arr[i]>=0){
            return loop(arr,i-1,w)+loop(arr,i-1,w-arr[i]);
        }else{
            return loop(arr,i-1,w);
        }
    }
}