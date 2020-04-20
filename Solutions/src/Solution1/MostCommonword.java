package Solution1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonword {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String str=paragraph.toLowerCase();
        String s="";
        int count=0;
        Set<String> set=new HashSet<>();
        for(String sa:banned){
            set.add(sa);
        }

        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            StringBuilder stringBuilder=new StringBuilder();
            while (i<str.length()&&str.charAt(i)<='z' && str.charAt(i)>='a' ){
                stringBuilder.append(str.charAt(i));
                i++;
            }
            String a=stringBuilder.toString();
            if(a.length()>0&&!set.contains(a)) {
                map.put(a, map.getOrDefault(a, 0) + 1);

                int count1 = map.get(a);
                if (count1 > count) {
                    s = a;
                    count = count1;
                }
            }
        }

        return s;

    }
}