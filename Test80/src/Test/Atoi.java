package Test;

public class Atoi {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i == str.length()) {
            return 0;
        }
        int flag = 1;
        char ch = str.charAt(i);
        if (ch == '+') {
            flag = 1;
            i++;
        }
        if (ch >= '0' && ch <= '9') {
            flag = 1;
        }
        if (ch == '-') {
            flag = -1;
            i++;
        }
        int res = 0;
        for (; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch < '0' || ch > '9') break;
            res = res * 10 + ch - '0';
            if (flag > 0 && i + 1 < str.length() && str.charAt(i + 1) >= '0'
                    && str.charAt(i + 1) <= '9' && res > Integer.MAX_VALUE / 10)
                return Integer.MAX_VALUE;
            if (flag > 0 && i + 1 < str.length() && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9'
                    && res == Integer.MAX_VALUE / 10 && str.charAt(i + 1) - '0' > Integer.MAX_VALUE % 10)
                return Integer.MAX_VALUE;
            if (flag < 0 && i + 1 < str.length() && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9'
                    && -res < Integer.MIN_VALUE / 10)
                return Integer.MIN_VALUE;
            if (flag < 0 && i + 1 < str.length() && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9'
                    && -res == Integer.MIN_VALUE / 10 && -(str.charAt(i + 1) - '0') < Integer.MIN_VALUE % 10)
                return Integer.MIN_VALUE;
        }
        return res*flag;

    }
}
