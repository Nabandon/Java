package Exercise;

public class Find2D {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length<=0||matrix[0].length<=0){
            return false;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
