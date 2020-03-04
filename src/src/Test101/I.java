package Test101;

public class I {
    public static void main(String[] args) {
      int x=2147395601;
        long i= 46339;
        long m=1;
        while(m<=x){
            i++;
            m=i*i;
        }
        System.out.println(i-1);
    }
}
