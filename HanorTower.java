import java.util.Scanner;
public class HanorTower{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       ht(n,'a','b','c');
        sc.close();
    }
    public static void ht(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a+"->"+c);
        }else{
            ht(n-1,a,c,b);
            System.out.println(a+"->"+c);
            ht(n-1,b,a,c);
        }
    }
}