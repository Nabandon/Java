package Exercise;

import java.util.*;

public class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] gird,int k){
//        位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
//        位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
//        位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
        for(;k>0;k--) {
            int[][] nums = new int[gird.length][gird[0].length];
            for(int i=0;i<gird.length;i++){
                for(int j=0;j<gird[0].length-1;j++){
                    nums[i][j+1]=gird[i][j];
                }
            }
            for(int i=0;i<gird.length-1;i++){
                nums[i+1][0]=gird[i][gird[0].length-1];
            }
            nums[0][0]=gird[gird.length-1][gird[0].length-1];
            gird=nums;
        }
        List<List<Integer>> result=new ArrayList<>();
           for(int[] row:gird){
                List<Integer> tem=new ArrayList<>();
                result.add(tem);
                for(int v:row){
                    tem.add(v);
                }
            }

           return result;
    }
}
