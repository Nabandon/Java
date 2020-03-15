package Test222;

import java.util.*;

public class StringB {
    public String convert(String s, int numRows) {
        if(numRows>=s.length()||numRows==1) return s;
        List<StringBuilder> rows=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            rows.add(new StringBuilder());
        }
        int j=0,flag=-1;
        for(char c:s.toCharArray()){
            rows.get(j).append(c);
            if(j==0||j==numRows-1) {
                flag=-flag;
            }
            j+=flag;
        }
        StringBuilder str=new StringBuilder();
        for(StringBuilder row:rows){
            str.append(row);
        }

        return str.toString();
    }
    public StringBuilder s(){
        String str="ww";
        StringBuilder str1=new StringBuilder();
        return str1.append(str);
    }

}
