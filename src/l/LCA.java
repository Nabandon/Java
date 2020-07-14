package l;

import java.util.Scanner;

public class LCA {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        String[] str=sca.nextLine().split(",");
        int x=Integer.parseInt(str[0].trim());
        int y=Integer.parseInt(str[1].trim());
        int n=Integer.parseInt(str[2].trim());
        int nx=0,ny=0;
        double min=256;
        for(int i=3;i<2*n+3;i+=2)
        {
            int a=Integer.parseInt(str[i].trim());
            int b=Integer.parseInt(str[i+1].trim());
            double way=Math.abs(a-x)+Math.abs(b-y);
            if(way<min)
            {
                nx=a;
                ny=b;
                min=way;
            }
        }
        System.out.println("("+nx+","+ny+")");
    }
}
