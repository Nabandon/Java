package Test90;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();
            int a=sca.nextInt();
            for(int i=0;i<n;i++){
                int b=sca.nextInt();
                if(b<=a){
                    a+=b;
                }else{
                    a+=g(a,b);
                }
            }
            System.out.println(a);
        }
    }
    private static int g(int a,int b){
        while(a>0){
            int t=a;
            a=b%a;
            b=t;
        }
        return b;
    }
}
