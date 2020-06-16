package Solution007;

import java.util.*;

public class Solution01 {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();
            StringBuilder str=new StringBuilder();
            int lf=n*n*n;
            int a1=(lf-n*(n-1))/n;
            for(int i=0;i<n;i++){
                if(i==n-1){
                    str.append(a1);
                    System.out.println(str.toString());
                    return;
                }else{
                    str.append(a1).append("+");
                    a1+=2;
                }
            }
        }
    }
}