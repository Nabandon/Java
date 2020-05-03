package Solution2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class Test {
    public int cutRope(int target) {
        if(target<=3){
            return target-1;
        }
        if(target%3==0){
            return (int)Math.pow(3,target/3);
        }else if(target%3==1){
            return 4*(int)Math.pow(3,(target-5)/3);
        }
        return 2*(int)Math.pow(3,target/3);
    }
    
}
