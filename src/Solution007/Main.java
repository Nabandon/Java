package Solution007;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        if(n<=0){
            return ;
        }
        int m=sca.nextInt();
        int k=m;
        for(int i=1;i<n;i++){
            if(k<=0){
                k=sca.nextInt();
            }else{
                k+=sca.nextInt();
            }
            if(k>m){
                m=k;
            }
        }
        System.out.println(m);
    }
}







