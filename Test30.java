class Test30{
public static void main(String[] args) {
    int n=5;
    int ret=factor(n);
    System.out.println(ret);
    
}
    public static int factor(int n){
        if(n==1){
            return 1;

        }
        return n*factor(n-1);
    }  
}