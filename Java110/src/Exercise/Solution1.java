package Exercise;
import java.util.Scanner;
public class Solution1 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder strb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                strb.append("%20");
            }else{
                strb.append(str.charAt(i));
            }
        }
        return strb.toString();
    }
    }

