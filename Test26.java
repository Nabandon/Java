class Test26{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=factor(i);
        }
        System.out.println(sum);
    }
    public static int factor(int i){
        int ret=1;
        for(int n=1;n<=i;n++){
            ret*=n;
        }
        return ret;
    }
}