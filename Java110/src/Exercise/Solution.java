package Exercise;

import java.util.Arrays;

public class Solution {
    public String compressString(String S) {
        int[] arr=new int[26];
        for(int i=0;i<S.length();i++){

            arr[ S.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();

        for(int j=0;j<26;j++){
            int sum=0;
            if(arr[j]!=0){
                sum+=arr[j];

                sb.append((char)j+'a').append(j);
            }
        }
        if(sb.toString().length()==S.length()){
            return S;
        }else{
            return sb.toString();
        }
    }
}
