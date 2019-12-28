public class Test33{
    public static void main(String[] args){
        int n=10;
        int sum=add(n);
        System.out.println("sum="+sum);
    }
    public static int add(int m){
        if(m==1){
        return m;
        }return m+add(m-1);
    }
}