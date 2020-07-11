package l;

import com.sun.xml.internal.bind.util.Which;

import java.util.Scanner;

public class xTo_hsi {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String str=sca.next();
            if(str.length()<3){
                System.out.println(0);
            }
            String x=str.substring(2);
            int res=0;
            int len=x.length();
            res+=h(x.charAt(len-1));
            int count=1;
            for(int i=len-2;i>-1;i--){
                int zi=h(x.charAt(i));
                double jin=Math.pow(16,count);
                res+=zi*jin;
                count++;
            }
            System.out.println((int)res);
        }
    }
    private static int h(char c){
        switch(c){
            case 'A' : return 10;
            case 'B' : return 11;
            case 'C' : return 12;
            case 'D' : return 13;
            case 'E' : return 14;
            case 'F' : return 15;
            default : return Integer.parseInt(c+"");
        }
    }
}
