package Solution1;

import javax.management.MBeanRegistration;

public class Sort {
    private void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
    }
    //插入排序;
    public void inertionSort(int[] arr){
        //[0,y)已排序区间;[y,size)待排序区间;
        for(int y=1;y<arr.length;y++){
            int cur=y-1;//已排序的最后一个元素;
            int n=arr[y];
            for(;cur>=0;cur--){
                if(arr[cur]>n){
                    arr[cur+1]=arr[cur];
                }else {
                    //找到位置;
                    break;
                }
            }
            arr[cur+1]=n;
        }
    }
    //希尔排序;
    public void shellSort(int[] arr){
        int gap=arr.length/2;//gap=size/2 , size/4,...
        while(gap>1){    // 循环进行分组插排
            inertionSortGap(arr,gap);
            gap/=2;
        }
        inertionSortGap(arr,1);//gap=1时就是插排了;
    }
    private void inertionSortGap(int[] arr,int gap){
        for(int boud=gap;gap<arr.length;gap++){
            int cur=boud-gap;
            int n=arr[boud];
            for(;cur>=0;cur-=gap){
                if(arr[cur]>arr[cur+gap]){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=n;
        }
    }

    //选择排序;
    public void selectSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            int n=arr[bound];
            for(int w=bound+1;w<arr.length;w++){
                if(n>arr[w]){
                    int tem=n;
                    n=arr[w];
                    arr[w]=tem;
                }
            }
        }
    }

    //堆排序;
    public  void heapSort(int[] arr){
        createHeap(arr);//建堆;
        for(int i=0;i<arr.length;i--){
            int heapSize=arr.length-i;
            swap(arr[0],arr[heapSize-1]);  //交换堆顶的最后一个元素;
            heapSize--;                    //堆的长度就-1;
            shiftDowe(arr,heapSize,0);//从新调整;
        }
    }
    private void createHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            shiftDowe(arr,arr.length,i);//从最后一个非叶子节点开始,依次向下调整;
        }
    }
    private void shiftDowe(int[] arr,int size,int index){
        int parent=index;
        int child=2*parent+1;
        while(child<size){
           if(child+1<size && arr[child+1]>arr[child]){
               child=child+1;
           }
           if(arr[parent]<arr[child]){
               int tem=arr[child];
               arr[child]=arr[parent];
               arr[parent]=tem;
           }else {
               break;
           }
           parent=child;
           child=2*parent+1;
        }
    }
    //冒泡排序
    public void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=0;cur<arr.length-bound-1;cur++){
                if(arr[cur]>arr[cur+1]){
                    swap(arr[cur],arr[cur+1]);
                }
            }
        }
    }
}
