package Solution007;

import java.util.*;

public class Solution01 {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String[] str=sca.nextLine().split(" ");
            int i0=Integer.parseInt(str[0]);
            StringBuffer res=new StringBuffer();

            for(int i=1;i<str.length;i++){
                int n=Integer.parseInt(str[i]);
                for(int j=0;j<n;j++){
                    res.append(i);
                }
            }
            if(i0!=0){
                for(int i=0;i<i0;i++){
                    res.insert(1,0);
                }
            }
            System.out.println(res.toString());
        }
    }
}