package Solution1;

public class ReverseSentence {
    public String ReverseSentence(String str) {
        if( str.length()<=1){
            return str;
        }
        if(str.trim().equals("")){
            return str;
        }
        String[]  strings=str.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=strings.length-1;i>=0;i--){
            stringBuilder.append(strings[i]);
            if(i!=0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
