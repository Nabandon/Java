public class Test23{
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int max1=Max1(a, b);
        System.out.println("max1="+max1);
        double a1=1.1;
        double b1=2.2;
        double max2=Max2(a1,b1);
        System.out.println("max2="+max2);
        int a2=1;
        int a3=2;
        double b2=1.1;
        double max3=Max3(a2,a3,b2);
        System.out.println("max3="+max3);
        double min3=Min3(a2,a3,b2);
        System.out.println("min3="+min3);
    }
    public static double Max3(int a,int b,double c){
        double max3;
       max3=(a>b?a:b)>c?(a>b?a:b):c;
        return max3;
    }
    public static double Min3(int a,int b,double c){
        double min3;
        min3=(a<b?a:b)<c?(a<b?a:b):c;
        return min3;
    }
    public static double Max2(double x,double y){
        double max1;
        if(x>y){
            max1=x;
        }else {
            max1=y;
        }return max1;
    }
    public static int Max1(int x,int y){
       int max1;
        if(x>y){
            max1=x;
        }else {
            max1=y;
        }return max1;
    }
}