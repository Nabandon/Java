package Test100;

public class Pow2 {
    public double myPow(double x,int n){
        long n1=n;
        if(n1<0){
            x=1/x;
            n1=-n1;
        }
        return pow(x,n1);
    }
    private double pow(double x,long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else
            return half * half * x;
    }
}
