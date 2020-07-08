package l;

import java.util.Scanner;

public class hua_quan {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        if(n<1){
            return;
        }
        String[][] as= new String[n][2];
        for(int i=0;i<n;i++){
            String jia=sca.next();
            String yi=sca.next();
            as[i][0]=jia;
            as[i][1]=yi;
        }
        count(as);
    }
    private static void count(String[][] as){
        int[] res=new int[3];
        int cj=0,jj=0,bj=0;
        int cy=0,jy=0,by=0;
        for(int i=0;i<as.length;i++){
            String jia=as[i][0];
            String yi=as[i][1];
            if(jia.equals("C")){
                if(yi.equals("C")){
                    res[1]++;
                }else if(yi.equals("J")){
                    res[0]++;
                    cj++;
                }else{
                    res[2]++;
                    by++;
                }
            }else if(jia.equals("J")){
                if(yi.equals("C")){
                    cy++;
                    res[2]++;
                }else if(yi.equals("J")){
                    res[1]++;
                }else{
                    jj++;
                    res[0]++;
                }
            }else{
                if(yi.equals("C")){
                    bj++;
                    res[0]++;
                }else if(yi.equals("J")){
                    jy++;
                    res[2]++;
                }else{
                    res[1]++;
                }
            }
        }
        System.out.println(res[0]+" "+res[1]+" "+res[2]);
        System.out.println(res[2]+" "+res[1]+" "+res[0]);
       int maxj=Math.max(Math.max(bj,cj),jj);
       if(maxj==bj){
           System.out.print("B"+" ");
       }else if(maxj==cj){
           System.out.print("C"+" ");
       }else {
           System.out.print("J"+" ");
       }
        int maxy=Math.max(Math.max(by,cy),jy);
        if(maxy==by){
            System.out.println("B");
        }else if(maxy==cy){
            System.out.println("C");
        }else {
            System.out.println("J");
        }
    }
}

