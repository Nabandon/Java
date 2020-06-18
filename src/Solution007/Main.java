package Solution007;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();
            if(n==0){
                return;
            }

            int f=sca.nextInt();
            int count=0;
            for(int i=0;i<n;i++){
                if(f==sca.nextInt()){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}




