package Solution007;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String s1=sca.next();
            String s2=sca.next();
            char[] s11=s1.toCharArray();
            char[] s22=s2.toCharArray();
            int count=s22.length;
            for(int i=0;i<s22.length;i++){
                for(int j=0;j<s11.length;j++){
                    if(s11[j]==s22[i]){
                        count--;
                        s11[j]= '.';
                        break;
                    }
                }
            }
            if(s11.length<s22.length){
                System.out.println("No"+" "+ count);
            }else {
                if(count>0){
                    System.out.println("No"+" "+count);
                }else {
                    System.out.println("Yes"+" "+(s11.length-s22.length));
                }
            }
        }
    }
}
