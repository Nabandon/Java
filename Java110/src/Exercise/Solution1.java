package Exercise;
import java.util.Scanner;
public class Solution1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str=in.nextLine();
            StringBuilder sb=new StringBuilder();
            int i=0;
            int size=str.length();
            while(i<size){
                char[] c=new char[1];
                c[0]=str.charAt(i);
                String s=new String(c);
                if(sb.toString().contains(s)){
                    i++;
                }else{
                    sb.append(str.charAt(i));
                    i++;
                }
            }
            System.out.println(sb.toString());
        }
    }

