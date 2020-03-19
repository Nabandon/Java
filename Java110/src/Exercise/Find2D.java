package Exercise;

public class Find2D {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length<=0||matrix[0].length<=0){
            return false;
        }
        int l1=0,r1=matrix.length-1;
        int r2=matrix[0].length-1;
        while(l1<=r1&&r2>=0){
            int num=matrix[l1][r2];
            if(num==target){
                return true;
            }else if(num>target){
                r2--;
            }else{
                l1++;
            }
        }
        return false;
    }
}