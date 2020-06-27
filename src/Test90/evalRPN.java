package Test90;

import java.util.Scanner;
import java.util.Stack;

public class evalRPN {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
       // while(sca.hasNext()){
            int n=sca.nextInt();
            int m=sca.nextInt();
            int[] nn=new int[n+1];

            for(int i=1;i<n+1;i++){
                nn[i]=sca.nextInt();
            }
            for(int i=0;i<m;i++){
                String c=sca.next();
                int a=sca.nextInt();
                int b=sca.nextInt();
                if(c.equals("U")){
                   nn[a]=b;
                }else {
                    int at=Math.min(a,b);
                    int bt=Math.max(a,b);
                    int t=nn[at];
                    for(int j=at;j<=bt;j++){
                        if(nn[j]>t){
                            t=nn[j];
                        }
                    }
                    System.out.println(t);
                }
            }
        }
    //}
}
