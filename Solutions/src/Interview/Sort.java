package Interview;

public class Sort {
    //归并
    public void mergeSort(int[] arr){
        helper(arr,0,arr.length);
    }
    private void helper(int[] arr,int star,int end){
        if(star<=end-1) {
            return;
        }
        int mid=star+(end-star)/2;
        helper(arr,star,mid);
        helper(arr,mid,end);
        //meger;
        int[] temp=new int[end-star];
        int left=star,h=mid,index=0;
        while (left<mid && h<end) {
            if (arr[left] <= arr[h]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[h++];
            }
        }
            while(left<mid){
                temp[index++]=arr[left++];
            }
            while(h<end){
                temp[index++]=arr[h++];
            }
            for(int i=0;i<end-star;i++){
                arr[star+i]=temp[i];
            }
    }
    //快排;
    public void quikSort(int[] arr){
        quikHelper(arr,0,arr.length-1);
    }
    private void quikHelper(int[] arr,int left,int right){
        if(left>=right) {
            return;
        }
        int midIndex=mid(arr,left,right);
        quikHelper(arr,left,midIndex-1);
        quikHelper(arr,midIndex+1,right);
    }
    private int mid(int[] arr,int left,int right){
        int b=arr[right];
        int r=right;
        while(left<right){
            while (left<right && arr[left]<=b){
                left++;
            }
            while (left<right && arr[r]>=b){
                r--;
            }
            int tem=arr[left];
            arr[left]=arr[r];
            arr[r]=tem;
        }
        int tem=arr[left];
        arr[left]=arr[right];
        arr[right]=tem;
        return left;
    }
    //希尔;
    public void shellSort(int[] arr){
        int gap=arr.length/2;
        while (gap>=1){
            shellHelper(arr,gap);
            gap/=2;
        }
    }
    private void shellHelper(int[] arr,int gap){
        for(int bound=gap;bound<arr.length;bound++){
            int pre=bound-gap;
            int cur=arr[bound];
            for(;pre>=0;pre-=gap){
                if(cur<arr[pre]){
                    arr[pre+gap]=arr[pre];
                }else {
                    break;
                }
            }
            arr[pre+gap]=cur;
        }
    }
    //堆排;
    public void heapSort(int[] arr){
        createHeap(arr);
        for(int i=0;i<arr.length;i++){
            int heapSize=arr.length-i;
            int tem=arr[0];
            arr[0]=arr[heapSize-1];
            arr[heapSize-1]=tem;
            shiftDown(arr,heapSize-1,0);
        }
    }
    private void createHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--) {
            shiftDown(arr, arr.length,i);
        }
    }private void shiftDown(int[] arr,int size,int i){
        int parent=i;
        int child=parent*2+1;
        while(child<size){
            if(child+1<size && arr[child]<arr[child+1]) {
                child=child+1;
            }
            if(arr[parent]<arr[child]){
                int tem=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tem;
            }else{
                break;
            }
            parent=child;
            child=parent*2+1;
        }
    }
}
