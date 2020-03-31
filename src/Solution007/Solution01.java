package Solution007;

import java.util.Stack;

public class Solution01 {
    public static void main(String[] args) {
        String[] s={"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(String s:ops){
            if(s.equals("+")){
                int num=stack.pop();
                int num3=(num+stack.peek());
                stack.push(num);
                stack.push(num3);
            }else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }else if(s.equals("C")){
                stack.pop();

            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        int i=0;
        while(!stack.isEmpty()){
            i+=stack.pop();
        }
        return i;
    }
}