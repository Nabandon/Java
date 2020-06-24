package Solution007;


import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String str=sca.nextLine();
            StringBuffer res=new StringBuffer();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c!=' '){
                    int t=(c+22-'A')%26 +'A'-1 ;
                    if(t<'A'){
                        res.append("Z");
                    }else{
                        res.append((char)t);
                    }
                }else{
                    res.append(c);
                }
            }
            System.out.println(res.toString());
        }
    }
}





