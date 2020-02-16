package Test100;

public class DG {
    public static void main(String[] args) {
        System.out.println(dg_n(5));
    }
    public static int dg_n(int n){
        if(n==1||n==2){
            return n;
        }else{
            int res=n*dg_n(n-1);
            return res;
        }
    }
}
