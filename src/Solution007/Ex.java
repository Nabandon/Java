package Solution007;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String addend=sca.next();
            String augend=sca.next();
            if(addend.length()<=0){
                System.out.println(augend);
                return;
            }
            if(augend.length()<=0){
                System.out.println(addend);
                return;
            }
            System.out.println(AddLongInteger(addend,augend));
        }
    }
    private static String AddLongInteger(String addend, String augend) {
        int i=addend.length()-1;
        int j=augend.length()-1;
        StringBuilder s1=new StringBuilder(addend);
        StringBuilder s2=new StringBuilder(augend);
        StringBuilder s=new StringBuilder();
        if(i<j){
            for(int k=0;k<j-i;k++){
                s1.insert(0,"0");
            }
        }if(j<i){
            for(int k=0;k<i-j;k++){
                s2.insert(0,"0");
            }
        }
        String s11=s1.toString();
        String s22=s2.toString();
        int n=0;
        for(int k=s11.length()-1;k>=0;k--){
            int i1=s11.charAt(k)-'0';
            int i2=s22.charAt(k)-'0';
            if(i1+i2+n>9){
                s.insert(0,(i1+i2+n-10));
                n=1;
            }else{
                s.insert(0,i1+i2+n);
            }
        }
        if(n==1){
            s.insert(0,1);
        }
        return s.toString();
    }
}
