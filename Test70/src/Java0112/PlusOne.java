package Java0112;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--) {
            digits[i]+=1;
            digits[i]%=10;
            if (digits[i]  != 0) {
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
       return digits;
    }
}
