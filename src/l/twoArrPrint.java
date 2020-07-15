package l;

public class twoArrPrint {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] res=new int[n*n];
        if(n<1){
            return res;
        }
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                res[index++]=arr[j][n-1+j-i];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                res[index++]=arr[i+j][j];
            }
        }
        return res;
    }
}
