import java.util.Scanner;
public class Test36{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=feibo(n);
            System.out.println(sum);
            sc.close();
    }
    public static int feibo(int n){
        if(n==1||n==2){
            return 1;
        }return feibo(n-1)+feibo(n-2);
    }
}