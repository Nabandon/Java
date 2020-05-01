package Solution1;

import java.lang.reflect.Array;
import java.util.*;

public class Match {
    public static void main(String[] args) {
        char[] str = {'a', 'a', 'a'};
        char[] pattern = {'a', '.', 'a'};
    }
    int[] res=new int[128];
    Queue<Character> que=new LinkedList<>();
    public void Insert(char ch)
    {
        res[ch]++;
        que.offer(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while(!que.isEmpty()){
            char c=que.peek();
            if(res[c]==1){
                return c;
            }else {
                que.poll();
            }
        }
        return '#';
    }
}
