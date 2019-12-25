import java.util.Scanner;
public class Test16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double max=Max3(a, b,c);
        System.out.println(max);
    }
    public  static double Max2(double a,double b) {
            double max2;
            if(a>b){
                max2=a;
            }else{
                max2=b;
            }
            return max2;
    }
    public static double Max3(double a,double b,double c){
        double max3;
       double max2=Max2(a,b);
       if(max2>c){
           max3=max2;
       }else{
           max3=c;
       }
       return max3;
    }
}