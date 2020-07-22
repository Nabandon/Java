package prejact;

import java.util.HashMap;
import java.util.Scanner;

public class PP {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String a=sca.next();
            String b=sca.next();
            boolean f=true;
            HashMap<Character,Integer> ma=new HashMap<>();
            HashMap<Character,Integer> mb=new HashMap<>();
            if(a.length()<b.length()){
                f=false;
            }else{
                int i=0;
                for( i=0;i<b.length();i++){
                    ma.put(a.charAt(i),ma.getOrDefault(a.charAt(i),0)+1);
                    mb.put(b.charAt(i),mb.getOrDefault(b.charAt(i),0)+1);
                }
                for(;i<a.length();i++ ){
                    ma.put(a.charAt(i),ma.getOrDefault(a.charAt(i),0)+1);
                }
                for(i=0;i<b.length();i++){
                    char c=b.charAt(i);
                    if(!ma.containsKey(c) || mb.get(c)>ma.get(c)){
                        f=false;
                        break;
                    }
                }
            }
            if(f){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
