public class Test44{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int ret=find(arr,9);
        System.out.println(ret);
    }
    public static int find(int[]arr1,int tofind){
        int left=0;
        int right=arr1.length-1;
        while(left<=right){
            int mid=(left+right)/2;
        if(tofind<arr1[mid]){
            right=mid-1;
        }else if(tofind>arr1[mid]){
            left=mid+1;
        }else{
            return mid;
        } 
    }   
        return -1;
 }
}