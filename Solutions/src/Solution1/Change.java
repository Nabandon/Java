package Solution1;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
         int[] arr={25,15,30,10,50,3,5,60};
    }
    public String LeftRotateString(String str,int n) {
        if(n<=0 || n>=str.length()){
            return str;
        }
        StringBuilder s1=new StringBuilder();
        int i=0;
        for(;i<n;i++){
            s1.append(str.charAt(i));
        }
        StringBuilder s2=new StringBuilder(str.substring(i,str.length()));
        s2.append(s1);
        return  s2.toString();
    }
}
