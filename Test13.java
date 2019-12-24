import java.util.Scanner;
class Test13{
    public static int print(int num){
        if(num<10){
            System.out.println(num);
            return num;
        }
        print(num/10);
        System.out.println(num%10);
        return 0; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        print(num);
        sc.close();
    }
}