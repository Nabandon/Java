package Test222;

import java.util.Arrays;

public class T {
    public static void main(String[] args) {
        int[] arr={73,74,75,71,69,72,76,73};
        int[] m=dailyTemperatures(arr);
        System.out.println(Arrays.toString(m));
    }
    public static int[] dailyTemperatures(int[] T) {
        int[] nums=new int[T.length];
        for(int i=0;i<T.length;i++){
            int count=0;
            for(int j=i;j<T.length;j++){
                if(T[j]<=T[i]){
                    count++;
                }
                if(j==T.length-1&&T[j]<=T[i]){
                    count=0;
                }else if(T[i]<T[j]){
                    break;
                }
            }
            nums[i]=count;
        }
        return nums;
    }
}
