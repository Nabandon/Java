package l;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args){
        String s = "jnwbbwnjb";
        boolean flag;
        flag=check(s);
        if (!flag) {
            flag=check(s.substring(1));
            if (!flag) {
                flag=check(s.substring(0,s.length()-1));
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    private static boolean check(String s) {
        int i=0,j=s.length()-1;
        while (i < j) {
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
