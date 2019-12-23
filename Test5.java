import java.util.Scanner;
public class Test5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        if(a>0&&a<=18){
        System.out.println("少年");
        }
        else if(a>=19&&a<=28){
            System.out.println("青年");
        }
        else if(a>=29&&a<=55){
            System.out.println("中年");
        }
        else if(a>=56){
            System.out.println("老年");
        }else{
            System.out.println("error!");
        } sc.close();
    }
}