package Java0112;

public class lengthOfLastWorld {
    public int lengthOfLastWord(String S){
        int end=S.length()-1;
        if(end<0){
            return 0;
        }
        while(end>=0&&S.charAt(end)==' '){
            end--;
        }
        int l=end;
        while(l>=0&&S.charAt(l)!=' '){
            l--;
        }
        return end-l;
    }
}
