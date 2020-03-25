package Exercise;
import java.util.Scanner;
public class Solution1 {
    public void reOrderArray(int [] array) {
        if(array.length<=1) return;
        int len=array.length;
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
                if(array[j]%2!=0&&array[j-1]%2==0){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
}

