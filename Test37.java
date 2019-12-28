import java.util.Scanner;
public class Test37{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=FrogJump(n);
        System.out.println(sum);
        sc.close();
    }
    public static int FrogJump(int n){
        if(n==1||n==2){
            return n;
        }
        return FrogJump(n-1)+FrogJump(n-2);
    }
}