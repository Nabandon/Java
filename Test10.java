public class Test10{
    public static void main(String[] args) {
        int i,j,k;
        int num;
        for(num=100;num<1000;num++){
            i=num/100;
            j=(num/10)%10;
            k=num%10;
            if(i*i*i+j*j*j+k*k*k==num){
                System.out.println(num);
            }
        }
    }
}