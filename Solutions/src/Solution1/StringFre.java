package Solution1;

import java.util.HashMap;
import java.util.Map;

public class StringFre {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int wordsLen=words.length;
        int[] wordsFre=new int[wordsLen];
        for(int i=0;i<wordsLen;i++){
            int count=frequency(words[i]);
            wordsFre[i]=count;
        }
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count1=frequency(queries[i]);
            for(int j=0;j<wordsLen;j++){
                if(count1<wordsFre[j]){
                    result[i]++;
                }
            }
        }
        return result;

    }
    private int frequency(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put(s.charAt(0),1);
        char fina=s.charAt(0);
        for(int i=1;i<s.length();i++){
           if( s.charAt(i)<fina){
               map.remove(fina);
               map.put(s.charAt(i),1);
               fina=s.charAt(i);
           }else if(s.charAt(i)==fina){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
           }
        }
       return map.get(fina);
    }
}
