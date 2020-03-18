package Exercise;

import java.util.Arrays;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==2){
            return Math.abs(stones[0]-stones[1]);
        }
        if(stones.length==1){
            return stones[0];
        }

        Arrays.sort(stones);
        if(stones[stones.length-3]==0){
            return stones[stones.length-1]-stones[stones.length-2];
        }


        stones[stones.length-1]=stones[ stones.length-1]-stones[stones.length-2];
        stones[stones.length-2]=0;

        return lastStoneWeight(stones);
    }

}
