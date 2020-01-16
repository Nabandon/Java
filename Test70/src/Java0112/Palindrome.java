package Java0112;

public class Palindrome {
    public boolean isPalindrome(int x){
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        if(x<10&&x>-1){
            return true;
        }
        int a=1;
       while(x/a>=10) {
           a *= 10;
       }
        while(x>0){
            int left=x/a;
            int right=x%10;
            if(left!=right){
                return false;
            }
            x=(x%a)/10;
            a/=100;
        }
        return true;
    }
}
