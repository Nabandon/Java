package Solution007;

public class Main {
    public boolean isPalindrome (String s) {
        // write code here
        int len=s.length();
        if(s==null || len<=1) {
            return true;
        }
        int left=0;
        int right=len-1;
        while(left<right){
            while(left<right && !is(s.charAt(left))){
                left++;
            }
            while(left<right && !is(s.charAt(right))){
                right--;
            }
            if(Character.toUpperCase(s.charAt(left))!=(Character.toUpperCase(s.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean is(char c){
        if(c<='9'&&c>='0' || c<='z'&&c>='a' || c<='Z'&&c>='A'){
            return true;
        }
        return false;
    }
    }


