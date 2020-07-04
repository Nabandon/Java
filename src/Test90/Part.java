package Test90;

import java.util.*;

public class Part{
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String str=sca.next();
            char[] cs=str.toCharArray();
            int count=0;
            for(int i=0;i<cs.length;i++){
                String s1=Integer.toBinaryString(cs[i]);
                String s2=String.format("%07d",Integer.parseInt(s1));
                count=0;
                for(int j=0;j<7;j++){
                    if(s2.charAt(j)=='1'){
                        count++;
                    }
                }
                if(count%2==0){
                    System.out.println("1"+s2);
                }else{
                    System.out.println("0"+s2);
                }

            }
        }
    }
}