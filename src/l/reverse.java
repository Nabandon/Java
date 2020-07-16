package l;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String s=sca.nextLine();
            int in=s.length();
            for(int i=s.length()-1;i>-1;i--){

                if(s.charAt(i)==' '){
                    System.out.print(s.substring(i+1,in)+" ");
                    in=i;
                }
            }
            System.out.print(s.substring(0,in));
            System.out.println();
        }
    }
}
