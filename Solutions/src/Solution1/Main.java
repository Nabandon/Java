package Solution1;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        long n=sca.nextInt();
        long k=sca.nextInt();
        long count=0;
        if(k==0){
            count=n*n;
        }else{
            for(long i=k+1;i<=n;i++){
                count+=(n/i)*(i-k);
                if(n%i>=k){
                    count+=n%i-k+1;
                }
            }
        }
        System.out.println(count);
    }
}