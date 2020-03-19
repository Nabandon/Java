package Exercise;

public class StringPlind {
    public int longestPalindrome(String s) {
        int[] arr=new int[123];
        for(char c:s.toCharArray()){
            arr[c]++;
        }
        int count=0;
        for(int x:arr){
            count+=x%2;
        }
        return count==0?s.length():(s.length()-count+1);
    }
}
