package Solution1;

public class ReversrPairs {
    public static void main(String[] args) {
        int[] a={1,3,2,3,1};
        System.out.println(reversePairs(a));
    }
    public static int reversePairs(int[] nums) {
            return mergeSort(nums,0,nums.length);
    }
    private static int mergeSort(int[] arr,int start,int end){
        if(end-start<=1){
            return 0;
        }
        int mid=start+(end-start)/2;
        int count=mergeSort(arr,start,mid)+mergeSort(arr,mid,end);
        int[] input=new int[end-start];
        int left=start,right=end,half=mid,index=0;
        while (left<mid && half<right){
            if(arr[left]<=arr[half]){
                input[index++]=arr[left++];
            }else{
                input[index++]=arr[half++];
                count+=mid-left;
            }
        }
        while(left<mid){
            input[index++]=arr[left++];

        }
        while(half<right){
            input[index++]=arr[half++];
        }
        for(int i=0;i<end-start;i++){
            arr[start+i]=input[i];
        }
        return count;
    }
}
