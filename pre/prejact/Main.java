package prejact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String str=sca.next();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c=='_'){
                    sb.append((str.charAt(i+1)+"").toUpperCase()) ;
                    i++;
                }else{
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
