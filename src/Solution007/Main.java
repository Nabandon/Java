package Solution007;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    class Point{
        int x;
        int y;
        Point(int a, int b) {
            x = a; y = b;
        }
    }
    public int maxPoints(Point[] points) {
        if(points.length<=2){
            return points.length;
        }
        int res=0;
        for(int i=1;i<points.length;i++){
            int count=0;
            long a=points[i].x;
            long b=points[i].y;
            long dx=a-points[i-1].x;
            long dy=b-points[i-1].y;
            if(dx==0 && dy==0){
                for(int j=0;j<points.length;j++){
                    if(points[j].x==a && points[j].y==b){
                        count++;
                    }
                }
            }else{
                for(int j=0;j<points.length;j++){
                    if((points[j].x-a)*dy==(points[j].y-b)*dx){
                        count++;
                    }
                }
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
