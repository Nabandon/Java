package Test101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DNA {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set=new HashSet<>();
        Set<String> res=new HashSet<>();
        int len=s.length();
        for(int i=0;i<=len-10;i++){
            String key=s.substring(i,i+10);
            if(set.contains(key)){
                res.add(key);
            }else{
                set.add(key);
            }
        }
        return new ArrayList<>(res);
    }
}
