package l;

import java.util.ArrayList;
import java.util.Scanner;

public class MuBangPin {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<n;j++){
            int i=sca.nextInt();
            int l=sca.nextInt();
            if(i==1){
                list.add(l);
            }else{
                list.remove((Integer)l);
            }
            boo(list);
        }
    }
    private static void boo(ArrayList<Integer> list){
        int len=list.size();
        if(len<3){
            System.out.println("No"); return;
        }
        int sum=0;
        for(int k=0;k<len;k++){
            sum+=list.get(k);
        }
        for(int m=0;m<len;m++){
            int b=sum-list.get(m);
            if(list.get(m)>=b){
                System.out.println("No"); return;
            }
        }
        System.out.println("Yes");
    }
}
