package Solution007;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int count = sca.nextInt();
        if(count<=0){
            System.out.println((char[]) null);
            return;
        }
        for (int i = 0; i < count; i++) {
            int n = sca.nextInt();
            int k = sca.nextInt();


            int[] arr = new int[2*n];
            for(int j=0;j<2*n;j++){
                arr[j]=sca.nextInt();
            }
            for (int m = 0; m < k; m++) {
                x(arr);
            }
            for(int c=0;c<arr.length;c++){
                if(c==arr.length-1){
                    System.out.print(arr[c]);
                }else{
                    System.out.print(arr[c]+" ");
                }
            }
            System.out.println();
        }

    }

    private static void x(int[] arr) {
        int[] a=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i+=2){
            a[i]=arr[j++];
        }
        for(int i=1;i<arr.length;i+=2){
            a[i]=arr[j++];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=a[i];
        }
    }
}




