package l;

import java.util.Scanner;

public class Num_steps {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();
            if(n<1){
                System.out.println("No Number");
            }
            for(int i=0;i<n;i++){
                int x=sca.nextInt();
                int y=sca.nextInt();
                if(y==x){
                    if(x%2==0){
                        System.out.println(x*2);
                    }else{
                        System.out.println(x*2-1);
                    }
                }else if(y==x-2){
                    if(x%2==0){
                        System.out.println(x*2-2);
                    }else{
                        System.out.println(x*2-3);
                    }
                }else{
                    System.out.println("No Number");
                }
            }
        }
    }
}
