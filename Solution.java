package Exercise;

import java.awt.desktop.PreferencesEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int[] a = {1,1,1,2,2,2,3,3};
        System.out.println(hasGroupsSizeX(a));

    }

    public static boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1) return false;
        Arrays.sort(deck);
        int count=1;
        for(int i=0;i<deck.length-1;i++){
            if(deck[i]==deck[i+1]){
                count++;
            }else{
                break;
            }
        }
        outer:
        for(int k=2;k<=count;k++){
            if(deck.length%k==0) {

                for(int j=0;j<deck.length;j+=k){
                    if(deck[j]!=deck[j+k-1]){
                        continue outer;
                    }
                }
                    return true;

            } else {
                continue;
            }

        }
        return false;
    }
}
