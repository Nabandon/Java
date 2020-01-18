package Java0112;

public class ReserseString {
    private String reverseOnlyLetters(String S) {
        if (S.length() <= 1) {
            return S;
        }
        int left = 0;
        int right = S.length() - 1;
        while (left < right) {
            while (left<right&& S.charAt(left) < 33 && S.charAt(left) > 122) {
                left++;
            }
            while (left<right&&S.charAt(right) < 33 && S.charAt(right) > 122) {
                right--;
            }

        }
        return S;
    }
}


