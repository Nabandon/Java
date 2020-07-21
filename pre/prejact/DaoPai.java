package prejact;

import java.util.Scanner;

public class DaoPai {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        String str=sca.nextLine();
        StringBuilder s=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
            if(c<='z'&&c>='a' || c<='Z'&&c>='A'){
                s2.append(c);
            }else{
                if(i>0){
                    char d=str.charAt(i-1);
                    if(d<='z'&&d>='a' || d<='Z'&&d>='A'){
                        s2.append(" ");
                        s.insert(0,s2);
                    }

                    System.out.println(s.toString());
                }else{
                    continue;
                }
            }
        }
        System.out.println(s.toString().trim());
    }
}
