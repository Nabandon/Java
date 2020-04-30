package Solution1;

import java.util.Arrays;

public class Continous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length!=5){
            return false;
        }
        Arrays.sort(numbers);
        int ling=0;
        int min=14,max=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]!=0){
                min=Math.min(min,numbers[i]);
                max=Math.max(max,numbers[i]);
                if(i<numbers.length-1 && numbers[i]==numbers[i+1]){
                    return false;
                }
            }
        }
        if(max-min>4){
            return false;
        }
        return true;
    }
}
