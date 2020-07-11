package l;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zimu_tongji {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            Map<Character,Integer> map=new HashMap<>();
            String str=sca.next();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c>='A' && c<='Z'){
                    map.put(c,map.getOrDefault(c,0)+1);
                }
            }
            for(char i='A';i<='Z';i++){
                System.out.print(i+":");
                System.out.println(map.getOrDefault(i,0));
            }
        }
    }
}
