package prejact;

public class MaxGap {
    public static void main(String[] args) {
        int[] a={2,7,3,1,1};
        System.out.println(findMaxGap(a,5));
    }
    public static int findMaxGap(int[] A, int n) {
        // write code here
        if(n<1){
            return 0;
        }
        int zmax=0;
        int ymax=0;
        double max=0;
        for(int i=0;i<n-1;i++){
            if(A[i]>A[zmax]){
                zmax=i;
            }
            if(i>=ymax){
                ymax=i+1;
                for(int j=i+1;j<n;j++){
                    if(A[j]>A[ymax]){
                        ymax=j;
                    }
                }
          }
            max=Math.max(max,Math.abs((double)A[zmax]-(double)A[ymax]));
        }
        return (int)max;
    }
}
