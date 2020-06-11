package Solution007;


import java.util.Scanner;

public class Main {
    public int countWays(int x, int y) {
        // write code here
        if(x<=0 || y<=0 || x==1 && y==1){
            return 0;
        }
        if(x==1 || y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }
    }







