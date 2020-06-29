package Test90;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        if(n<1){
            return;
        }
        int[] credit=new  int[n];
        int sum_credit=0;
        for(int i=0;i<n;i++){
            int k=sca.nextInt();
            sum_credit+=k;
            credit[i]=k;
        }
        double sumj=0f;
        for(int i=0;i<n;i++){
            int k=sca.nextInt();
            double t=0d;
            if(k>=90 && k<=100){
                t=4.0*credit[i];
            }else if(k>=85 && k<=89){
                t=3.7*credit[i];
            }else if(k>=82 && k<=84){
                t=3.3*credit[i];
            }else if(k>=78 && k<=81){
                t=3.0*credit[i];
            }else if(k>=75 && k<=77){
                t=2.7*credit[i];
            }else if(k>=72 && k<=74){
                t=2.3*credit[i];
            }else if(k>=68 && k<=71){
                t=2.0*credit[i];
            }else if(k>=64 && k<=67){
                t=1.5*credit[i];
            }else if(k>=60 && k<=63){
                t=1.0*credit[i];
            }else{
                t=0.0;
            }
            sumj+=t;
        }
        System.out.printf("%.2f",sumj/sum_credit);
    }
}
