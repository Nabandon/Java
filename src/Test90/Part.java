package Test90;

import java.util.Stack;

public class Part {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length<=2) return true;
        int j=0;
        Stack<Integer> stack=new Stack<>();
        for(int x:pushed){
            stack.push(x);
            while(!stack.isEmpty() && j<popped.length && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}
