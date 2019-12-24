import java.util.Scanner;
public class Test14{
    public static void main(String[] args) {
        System.out.println("input password:");
        for(int count=1;count<=3;count++){
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
            if(password.equals("123456")){
                 System.out.println("ture");
                 break;
        }else{
            System.out.println("false"); 
        }
      } 
    }
}