package Exercise;

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
    public static boolean checkPerfectNumber(int num) {
        if(num==1 || num==2) return false;
        int a=num/2;
        int b=1;
        for(int i=2;i<=a;i++){
            if(num%i==0){
                b+=i+num/i;
                a=num/i;
            }
        }
        if(b==num){
            return true;
        }
        return false;
    }
}
