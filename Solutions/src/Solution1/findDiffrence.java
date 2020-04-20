package Solution1;

import java.util.HashSet;
import java.util.Set;

public class findDiffrence {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char ts:t.toCharArray()){
            res+=ts;
        }

        for(char cs:s.toCharArray()){
            res-=cs;
        }
        return res;
//        Set<Character> set=new HashSet<>(0);
//        for(char c:s.toCharArray()){
//            set.add(c);
//        }
//        for(char tc:t.toCharArray()){
//            if(!set.contains(tc)){
//                return tc;
//            }
//        }
//        return ' ';
    }
}
