package Solution1;

import java.util.Stack;

public class Exercise {
    public static void main(String[] args) {
        String s="y#fo##f";
        String t= "y#f#o##f";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s=new Stack<>();
        Stack<Character> t=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#'&& !s.isEmpty()){
                s.pop();
            }else if(S.charAt(i)!='#'){
                s.push(S.charAt(i));
            }
        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='#'&& !t.isEmpty()){
                t.pop();
            }else if(T.charAt(i)!='#'){
                t.push(T.charAt(i));
            }
        }
        while(!s.isEmpty() && !t.isEmpty() && s.peek()==t.peek()){

            s.pop();
            t.pop();

        }
        if( s.isEmpty() && t.isEmpty()){
            return true;
        }
        return false;
    }
}
