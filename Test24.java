 import java.util.Scanner ;
public class Test24{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        int num=0;
        while(sc.hasNextDouble()){
            double tmp=sc.nextDouble();
            sum+=tmp;
            num++;
        }
            System.out.println("sum="+sum);
            System.out.println("avg="+sum/num);
            sc.close();
        }
    }
