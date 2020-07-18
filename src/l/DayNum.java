package l;

import java.util.Scanner;

public class DayNum {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int year=sca.nextInt();
            int month=sca.nextInt();
            int day=sca.nextInt();

            if(year<1 || month<1 || month>12 || day<1 || day>31){
                System.out.println(-1);
            }else{
                int[] tian={31,28,31,30,31,30,31,31,30,31,30,31};
                boolean f=run(year);
                if(f){
                    tian[1]=29;
                }
                if(tian[month-1]<day){
                    System .out.println(-1);
                }else{
                    int res=0;
                    for(int i=0;i<month-1;i++){
                        res+=tian[i];
                    }
                    res+=day;
                    System.out.println(res);
                }
            }
        }
    }
    private static boolean run(int y){
        if((y%400==0) || (y%4==0 && y%100!=0)){
            return true;
        } else{
            return false;
        }
    }
}
