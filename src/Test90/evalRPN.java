package Test90;

import java.util.Stack;

public class evalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            if(s.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }
            if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            if(s.equals("/")){
                int num=stack.pop();
                stack.push(stack.pop()/num);
            }else{

                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
