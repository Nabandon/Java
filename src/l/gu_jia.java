package l;

public class gu_jia {
    public int calculateMax(int[] prices) {
        int fb=Integer.MIN_VALUE , fs=0;
        int sb=fb , ss=0;
        for(int i=0;i<prices.length;i++){
            fb=Math.max(fb,-prices[i]);
            fs=Math.max(fs,fb+prices[i]);

            sb=Math.max(sb,fs-prices[i]);
            ss=Math.max(ss,sb+prices[i]);
        }
        return ss;
    }
}
