package Solution1;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        int[] x1=new int[n];
        int[] y1=new int[n];
        int[] x2=new int[n];
        int[] y2=new int[n];
        for(int i=0;i<n;i++){
            x1[i]=sca.nextInt();
        }
        for(int i=0;i<n;i++){
            y1[i]=sca.nextInt();
        }
        for(int i=0;i<n;i++){
            x2[i]=sca.nextInt();
        }
        for(int i=0;i<n;i++){
            y2[i]=sca.nextInt();
        }
        int ans = 0;
        int cnt = 0;
        for (int x : x1) {
            for (int y : y1) {
                for (int i = 0; i < n; i++) {
                    if (x >= x1[i] && x < x2[i] && y >= y1[i] && y < y2[i]) {
                        cnt++;
                    }
                }
                if (cnt > ans) {
                    ans = cnt;
                }
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}