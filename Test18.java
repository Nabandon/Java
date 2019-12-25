
import java.util.Scanner;
public class Test18{
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int sum=1;
        for(i=1;i<=n;i++){
            sum*=i;
        }System.out.println(sum);
        sc.close();
    }

}