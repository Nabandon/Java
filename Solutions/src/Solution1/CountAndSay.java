package Solution1;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder();
        if(n==1) return "1";
        int pre=0;
        int cur=1;
        String str=countAndSay(n-1);
        for(;cur<str.length();cur++){
            if(str.charAt(cur)!=str.charAt(pre)){
                int count=cur-pre;
                sb.append(count).append(str.charAt(pre));
                pre=cur;
            }
        }
        if(pre!=cur){
            sb.append(cur-pre).append(str.charAt(pre));
        }
        return sb.toString();
    }
}
