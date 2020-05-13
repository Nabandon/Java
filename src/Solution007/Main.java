package Solution007;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arrn=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            arrn[i]=a+s.nextInt();
            a=arrn[i];
        }
        int m=s.nextInt();
        int[] arrm=new int[m];
        for(int j=0;j<m;j++){
            arrm[j]=s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int index = Arrays.binarySearch(arrn, arrm[i]);
            if (index>0) {
                System.out.println(index+1);
            }else{
                System.out.println(-index);
            }
        }
    }
}
