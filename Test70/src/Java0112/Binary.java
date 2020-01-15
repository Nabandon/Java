package Java0112;

public class Binary {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        System.out.println(search(arr,5));
    }
    public static int search(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(k>arr[mid]){
                left=mid+1;
            }
            if(k<arr[mid]){
                right=mid-1;
            }
            if(k==arr[mid]){
                return mid;
            }
        }return -1;
    }
}
