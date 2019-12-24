public class Test9 {
public static void main(String[] args) {
    double sum1=1.0;
    double sum2=1.0;
    for(double i=1;i<=99;i+=2){
        sum1+=1/i;
    }
    for(double j=2;j<=100;j+=2){
        sum2+=1/j;
    }
    System.out.println("sum="+(sum1-sum2));
 }  
} 
    
