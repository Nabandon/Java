package Solution007;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        if(n<=1){
            System.out.println(-1);
            return;
        }
        int[][] arr=new int[n][n];
        ArrayList<int[][]> list1= new ArrayList<>();
        ArrayList<int[][]> list0= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sca.nextInt();
                if(arr[i][j]==1){
                    int[][] t=new int[1][2];
                    t[0][0]=i;
                    t[0][1]=j;
                    list1.add(t);
                }else if(arr[i][j]==0){
                    int[][] t=new int[1][2];
                    t[0][0]=i;
                    t[0][1]=j;
                    list0.add(t);
                }
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<list0.size();i++){
            int tem=0;
            int x=list0.get(i)[0][0];
            int y=list0.get(i)[0][1];
            for(int j=0;j<list1.size();j++){
                tem+=Math.abs(list1.get(j)[0][0]-x)+Math.abs(list1.get(j)[0][1]-y);
            }
            res=Math.min(res,tem);
        }
        System.out.println(res==Integer.MAX_VALUE?-1:res);
    }
}







