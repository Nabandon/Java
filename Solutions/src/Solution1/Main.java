package Solution1;


import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<m;i++){
            int k=s.nextInt();
            arr[k]++;
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}