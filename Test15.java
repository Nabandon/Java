import java.util.Scanner;
public class Test15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("odd sequence:");
        for(int i=30;i>=0;i-=2){
            System.out.print((num>>i)&1);
        }
        System.out.print("   even sequence:");
        for(int i=31;i>0;i-=2){
            System.out.print((num>>i)&1);
        }
        sc.close();
    }
}