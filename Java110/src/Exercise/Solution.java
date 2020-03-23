package Exercise;

import java.util.Arrays;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] lic = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if(c<='z'&&c>='a') {
                lic[c - 'a']++;
            }else if(c<='Z'&&c>='A'){
                lic[c-'A']++;
            }
        }
        int len = Integer.MAX_VALUE;
        String ans = "";
        for (String w : words) {

            int[] temp = new int[26];
            for (char c : w.toCharArray()) {
                if(c<='z'&&c>='a') {
                    temp[c - 'a']++;
                }else if(c<='Z'&&c>='A'){
                    temp[c-'A']++;
                }
            }
            boolean boo=is(temp,lic);
            if(boo==true){
                if(w.length()<len){
                    len=w.length();
                    ans=w;
                }
            }
        }
            return ans;
    }

    private boolean is(int[] a1, int[] a2) {
        for (int i = 0; i < 26; i++) {
            if (a1[i] < a2[i]) {
                return false;
            }
        }
        return true;
    }
}


