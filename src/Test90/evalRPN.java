package Test90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class evalRPN {

        private static boolean match(String matchStr, String str, int matchIdx, int idx) {
            if (matchIdx == matchStr.length() && idx == str.length()) {
                return true;
            }

            //str匹配到最后一个字符了，matchIdx后面还有多个*的情况
            if (idx == str.length() && matchIdx < matchStr.length() && matchStr.charAt(matchIdx) == '*') {
                return match(matchStr, str, matchIdx + 1, idx);
            }
            if (matchIdx >= matchStr.length() || idx >= str.length()) {
                return false;
            }
            //匹配中出现了不同的字符
            if (matchStr.charAt(matchIdx) != '*' && matchStr.charAt(matchIdx) != str.charAt(idx)) {
                return false;
            }
            boolean flag = false;
            //匹配中对*处理，*能表示多个字符，所以idx + 1，直到到达str的最后一个字符
            if (matchStr.charAt(matchIdx) == '*') {
                flag = match(matchStr, str, matchIdx + 1, idx) || match(matchStr, str, matchIdx, idx + 1);
            }
            //匹配中两个字符串的字符相同的情况，用与或保证可以从false变回true
            if (matchStr.charAt(matchIdx) == str.charAt(idx)) {
                flag |= match(matchStr, str, matchIdx + 1, idx + 1);
            }
            return flag;
        }

        private static List<Integer[]> getMatchPosAndLen(String matchStr, String str) {
           List<Integer[]> ans = new ArrayList<>();
            //找到头尾都相等的情况
            for (int i = 0; i < str.length(); ++i) {
                //保证第一个字符相同
                if (matchStr.charAt(0) != '*' && matchStr.charAt(0) != str.charAt(i)) {
                    continue;
                }

                for (int j = i; j < str.length(); ++j) {
                    //保证最后一个字符相同
                    if (matchStr.charAt(matchStr.length() - 1) != '*' && matchStr.charAt(matchStr.length() - 1) != str.charAt(j)) {
                        continue;
                    }
                    if (match(matchStr, str.substring(i, j + 1), 0, 0)) {
                        ans.add(new Integer[]{i, j - i + 1});
                    }
                }
            }
            if (ans.size() == 0) {
                ans.add(new Integer[]{-1, 0});
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String matchStr = in.next();
            String str = in.next();
            List<Integer[]> list = getMatchPosAndLen(matchStr, str);
            for (Integer[] arr : list) {
                System.out.println(arr[0] + " " + arr[1]);
            }

        }
    }

