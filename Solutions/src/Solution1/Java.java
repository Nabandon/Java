package Solution1;

import java.util.Scanner;

public class Java {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        int k=sca.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sca.nextInt();
        }
        int left=0;
        int right=n-1;
        while(left<right){
            if((arr[left]+arr[right])<k){
                left++;
            }else if((arr[left]+arr[right])==k){
                if(left==0 || arr[left]!=arr[left-1] || right==n-1){
                    System.out.println(arr[left]+" " +arr[right]);
                }
                left++;
                right--;
            }else{
                right--;
            }
        }
    }
}
