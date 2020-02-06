
public class HalfS {
    private int half(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int n=(left+right)/2;
            if(arr[n]<k){
                left=n+1;
            }else if(arr[n]>k){
                right=n-1;
            }else{
                return n;
            }
        }
        return -1;
    }
}
