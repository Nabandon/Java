package Test90;

import java.util.*;
import java.util.ArrayList;

public class evalRPN {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();
            if(n<=0){
                return;
            }
            HashMap<Integer,Integer> map=new HashMap<>();

            for(int i=0;i<n;i++){
                map.put(sca.nextInt(),i);
            }
            int m=sca.nextInt();

            if(map.containsKey(m)){
                System.out.println(map.get(m));
            }else{
                System.out.println(-1);
            }


        }
    }
}

