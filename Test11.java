import java.util.Scanner;
import java.util.Random;
class Test11{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int toGuess=random.nextInt(100);
        while(true){
            System.out.println("input:(1-100)");
            int num=sc.nextInt();
            if(num<toGuess){
                System.out.println("small");
            }else if(num>toGuess){
                System.out.println("more");
            }else{
                System.out.println("ture");
                break;
            }
        }
        sc.close();
    }
}