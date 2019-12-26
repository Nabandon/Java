import java.util.Scanner;
public class Test22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ret=addint(a, b);
        System.out.println(ret);
        double a1=sc.nextDouble();
        double b1=sc.nextDouble();
        double c1=sc.nextDouble();
        double ret2=adddouble(a1,b1,c1);
        System.out.println(ret2);
        sc.close();
    }
    public static int addint(int x,int y){
        return x+y;
    }
    public static double adddouble(double x,double y,double z){
        return x+y+z;
    }
}