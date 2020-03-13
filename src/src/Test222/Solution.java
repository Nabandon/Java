package Test222;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        gcd(21,31);
    }
    public static  void gcd(int n,int m) {
        int min=Math.min(m,n);
        int max=Math.max(m,n);
        int k=max%min;
        while (k>0){
               max=min;
               min=k;
               k=max%min;
        }
        System.out.println("最大公约数:"+min);
        System.out.println("最小公倍数:"+m*n/min);
    }
}



