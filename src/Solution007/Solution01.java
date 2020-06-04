package Solution007;

import java.util.*;

public class Solution01 {

    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!map.containsKey(s)){
                map.put(s,i);
            }else{
                set.add(map.get(s));
                set.add(i);

            }
        }
        Iterator it=set.iterator();
        while(it.hasNext()){
            int n=(int)it.next();
            list.add(strs[n]);

        }
        return list;
    }
}