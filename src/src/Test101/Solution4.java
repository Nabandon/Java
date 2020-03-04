package Test101;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
      //  System.out.println(SSS.mySqrt(8));
    }
    public static int mySqrt(int x) {
        if(x==0||x==1) return x;

       int left=2;
        int right=x/2;
        long nums;
        while(left<=right){
        int   mind=left+(right-left)/2;
            nums=(long)mind*mind;
            if(nums>x) {
                right = mind - 1;
            }
            else if(nums<x) {
                left = mind + 1;
            }else {
                return mind;
            }
        }
        return right;
    }
}
