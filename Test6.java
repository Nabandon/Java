public class Test6{
    public static void main(String[] args) {
        int n;
        int count=0;
        for(n=1;n<=100;n++){
            if(n%10==9){
            count++;}
        if(n/10==9){
            count++;
        }
    }
        System.out.println(count);
    }
}