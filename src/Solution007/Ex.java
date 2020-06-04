package Solution007;



import java.util.*;

public  class Ex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            int res=0;
            while(n>0){
                if(n%8==0){
                    System.out.println(res+n/8);
                }else {
                    res++;
                    n-=6;
                }
            }
            if(n==0){
                System.out.println(res);
            }else {
                System.out.println(-1);
            }
        }
    }
}
