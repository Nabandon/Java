
import java.util.Scanner;
public class Test19{
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int sum=1;
        int result=0;
        for(i=1;i<=n;i++){
            sum*=i;
            result+=sum;
        }
        System.out.println(result);
        sc.close();
    }

}