package Test222;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        if(n==0) return 1;
        if(n==1||n==2) return n;
        int a = 1, b = 2, sum=0;
        for(int i = 3; i <=n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}



