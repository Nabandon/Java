class Test29{
    public static void main(String[] args) {
        int a=10;int b=20;
        int ret=add(a,b);
        System.out.println(ret);
        double a2=100;
        double b2=200;
        double ret2=add(a2,b2);
        System.out.println(ret2);
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static double add(double x,double y){
        return x+y;
    }
}