import java.util.Scanner;
public class Test7{
    public static void main(String[] args) {
        int i=1;
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i!=0){
            if((n&i)!=0){
            count++;
        }
        i<<=1;
        }
        System.out.println(count);
    sc.close();
    }
}