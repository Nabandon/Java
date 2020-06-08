package Solution007;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String[] str=sc.nextLine().split(" ");
        int w=Integer.parseInt(str[0]);
        int h=Integer.parseInt(str[1]);
        int count=0;
        int[][] arr=new int[w][h];
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                if(arr[i][j]==0){
                    count++;
                    if(i+2<w){
                        arr[i+2][j]=-1;
                    }
                    if(j+2<h){
                        arr[i][j+2]=-1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
