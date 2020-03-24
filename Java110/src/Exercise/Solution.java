package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public boolean Find(int target, int [][] array) {
        int h=0,l=array[0].length-1;
        while(h<array.length && l>=0){
            if(target<array[h][l]){
                l--;
            }
            else if(target>array[h][l]){
                h++;
            }else{
                return true;
            }
        }
        return false;
    }
}
