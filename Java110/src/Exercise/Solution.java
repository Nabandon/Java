package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n = 2;
        int[][] a = {{1, 2}};
        System.out.println(findJudge(n, a));

    }

    public static int findJudge(int N, int[][] trust) {
        if (N == 1) return 1;
        if (trust.length <= 0) return -1;

        int[] n = new int[N + 1];
        for (int i = 0; i < trust.length; i++) {
            n[trust[i][1]]++;
            n[trust[i][0]]--;
        }
        for (int j = 1; j < N + 1; j++) {
            if (n[j] == N - 1) {

                    return j;

            }
        }
        return -1;
    }
}
