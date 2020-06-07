package Solution007;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex {

static int i=0;
    public int[] twoSum (int[] numbers, int target) {
//        // write code here
//        for(int i=0;i<numbers.length;i++){
//            for(int j=i+1;j<numbers.length;j++){
//                if(numbers[i]+numbers[j]==target){
//                    return new int[]{i+1,j+1};
//                }
//            }
//        }
//        return null;

       // 哈希
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                res[0]=map.get(numbers[i])+1;
                res[1]=i+1;
                break;
            }else{
                map.put(target-numbers[i],i);
            }
        }
        return res;
    }
}
