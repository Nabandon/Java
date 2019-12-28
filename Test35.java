import java.util.Scanner;
public class Test35{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ret=add(n);
        System.out.println(ret);
        sc.close();
    }
    public static int add(int n){
        if(n<10){
            return n;
        }
        return n%10+add(n/10);
    }
}