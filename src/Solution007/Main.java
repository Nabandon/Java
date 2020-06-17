package Solution007;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int lo=sca.nextInt();
        int count=0;

        while(count<=300000){
            if(lo%1000000007==0){
                break;
            }else{
                count++;
                lo=(2*lo+1)%1000000007;
            }
        }
        int res = (count + 2) / 3;
        System.out.println(res > 100000 ? -1 : res);
    }
}






