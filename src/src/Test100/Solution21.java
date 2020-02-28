package Test100;

public class Solution21 {
    public static void main(String[] args) {
        System.out.println(divide(10,3));
    }
    public static int divide(int dividend, int divisor) {
        if(dividend==0 || dividend>0&&divisor>0&&dividend<divisor ||
                dividend>0&&divisor<0&&dividend<-divisor ||
                dividend<0&&divisor<0&&dividend>divisor ||
                 dividend<0&&divisor>0&&dividend>-divisor)  return 0;
        if(dividend==divisor) return 1;
        if(dividend==-divisor) return -1;
        if(divisor==1) return dividend;
        if(dividend>Integer.MIN_VALUE&&divisor==-1) return -dividend;
        if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        int sing=1;
        if(dividend>0&&divisor<0||dividend<0&&divisor>0) sing=-1;
        if(dividend>0) dividend=-dividend;
        if (divisor>0) divisor=-divisor;
        int res=0;
        for(long i=divisor;i>=dividend;i+=divisor){
                res++;
        }
        return res*sing;
    }
}
