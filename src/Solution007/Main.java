package Solution007;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<3){
            System.out.println();
            return ;
        }
        int k=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int left=0, mid=left+1, right=n-1;
        for(;left<right;left++){
            for(mid=left+1;mid<right;mid++){
                if(mid<right && arr[left]+arr[mid]+arr[right]<k){
                    mid++;
                }else if(mid<right && arr[left]+arr[mid]+arr[right]>k){
                    right--;
                }else if(mid<right && arr[left]+arr[mid]+arr[right]==k){
                    System.out.println(arr[left]+" "+arr[mid]+" "+arr[right]);
                }
            }
        }
    }
}
