package l;

import java.util.Scanner;

public class R_ti {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int[] arr=new int[6];
            for(int i=0;i<6;i++){
                arr[i]=sca.nextInt();
            }
            double r=Math.pow(arr[0]-arr[3],2)+Math.pow(arr[1]-arr[4],2)+Math.pow(arr[2]-arr[5],2);
            double R=Math.sqrt(r);
            double t=Math.acos(-1)*Math.pow(R,3)*4/3;
            double t1=(4/3)*Math.acos(-1)*Math.pow(R,3);

            System.out.printf("%.3f %.3f",R,t);
            System.out.println();
        }
    }
}
