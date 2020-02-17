package Test100;

public class Area {
    public int maxArea(int[] height){
        int area=0;
        for(int a=0;a<height.length-1;a++){
            for(int b=a+1;b<height.length;b++){
                int min_height=Math.min(height[a],height[b]);
                area=Math.max(area,Math.min(height[a],height[b])*(b-a));
            }
        }
        return area;
    }
}
