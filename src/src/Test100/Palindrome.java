package Test100;

public class Palindrome {
    public boolean isPalindrome(int x){
        String arr=new StringBuilder(x).toString();
        int left=0;
        int right=arr.length()-1;
        while(left<right){
            if(arr.charAt(left)!=arr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
