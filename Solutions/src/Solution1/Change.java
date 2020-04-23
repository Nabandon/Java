package Solution1;

public class Change {
    public static String change (String number) {
        // write code her
        char[] chars=number.toCharArray();
        int left=0;
        int right=number.length()-1;
        while(left<right){
            while(left<right && chars[left]%2!=0){
                left++;
            }
            while(left<right && chars[right]%2!=0){
                right--;
            }
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
       StringBuilder str=new StringBuilder();
        for(char c:chars){
            str.append(c);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(change("123456"));
    }
}
