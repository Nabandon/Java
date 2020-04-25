package Solution1;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(fe(n));
        }
    }
    private static int fe(int n){
        int cur1=0,cur2=1;
        int sum=cur1+cur2;
        int min=Integer.MAX_VALUE;
        while(sum<=n){
            if(sum==n){
                return 0;
            }
            cur1=cur2;
            cur2=sum;
            sum=cur1+cur2;
            min=Math.min(min,Math.abs(n-sum));
        }
        min=Math.min(min,Math.abs(n-sum));
        return  min;
    }
}
