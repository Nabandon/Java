package Solution1;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("googgle"));
    }
    public static int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}