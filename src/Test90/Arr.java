package Test90;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sca.nextInt();
        }
        int a1=0,a2=0,a3=0,a5=0,c=0 ,a4c=0;
        double a4=0.0;
        boolean t=false;
        for(int i=0;i<n;i++){
            if(arr[i]%10==0){
                a1+=arr[i];
            }
            if(arr[i]%5==1){
                t=true;
                if(c==0){
                    a2+=arr[i];
                    c=1;
                }else{
                    a2-=arr[i];
                    c=0;
                }
            }
            if(arr[i]%5==2){
                a3++;
            }
            if(arr[i]%5==3){
                a4c++;
                a4+=arr[i];
            }
            if(arr[i]%5==4 && arr[i]>a5){
                a5=arr[i];
            }
        }
        if(a1!=0){
            System.out.print(a1+" ");
        }else{
            System.out.print("N ");
        }
        if(t){
            System.out.print(a2+" ");
        }else{
            System.out.print("N ");
        }
        if(a3!=0){
            System.out.print(a3+" ");
        }else{
            System.out.print("N ");
        }
        if(a4!=0){
            double m=a4/a4c;
            System.out.printf("%.1f",m);
            System.out.print(" ");
        }else{
            System.out.print("N ");
        }
        if(a5!=0){
            System.out.print(a5+" ");
        }else{
            System.out.print("N ");
        }
    }
}
