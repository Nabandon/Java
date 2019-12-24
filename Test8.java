import java.util.Scanner;
public class Test8{
public static void main(String[] args) {
    
    int  m,n,tmp;
    Scanner sc=new Scanner(Syste.in);
    int a=sc.nextInt;
    int b=sc.nextInt;
  m=a;n=b;
  if(a<b){
      m=b;n=a;
  }
  while(n>0){
      tmp=m%n;
      m=n;
      n=tmp;
  }
  
    System.out.println("最大公约数是：" + m);
    sc.close();
    }
}
