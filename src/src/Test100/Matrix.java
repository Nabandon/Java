package Test100;

public class Matrix {
    public void rotate (int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int left=0;
        while(left<n){
            int y=0,right=n-1;
            while(y<right){
                int temp=matrix[left][y];
                matrix[left][y]=matrix[left][right];
                matrix[left][right]=temp;
                y++;
                right--;
            }
            left++;
        }
    }
}
