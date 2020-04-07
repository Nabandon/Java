package Solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Java_0402 {

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public void push(int node) {
        s1.push(node);
    }

    public void pop() {
        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        int min=Integer.MAX_VALUE;
        while(!s1.isEmpty()){
            int tem=s1.pop();
            min=Math.min(min,tem);
            s2.push(tem);
        }
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return min;
    }

}
