package Solution1;

import javax.management.MBeanRegistration;

public class Sort {
    private void swap(int i,int j){
        int t=i;
            i=j;
            j=t;
    }
    //归并排序;
    public void mergeSort(int[] arr){ //非递归;
        for(int gap=1;gap<arr.length;gap*=2){
            for(int i=0;i<arr.length;i+=2*gap){
                int beg=i;
                int mid=i+gap;
                int end=i+2*gap;
                if(mid>arr.length){
                    mid=arr.length;
                }
                if(end>arr.length){
                    end=arr.length;
                }
                merge(arr,beg,mid,end);
            }
        }
    }
    public void megerSort1(int[] arr){//递归;
        mergeSortIntr(arr,0,arr.length);
    }
    private void mergeSortIntr(int[] arr,int beg,int end){
        if(end-beg<=1){
            return;
        }
        int mid=beg+(end-beg)/2;
        mergeSortIntr(arr,beg,mid);
        mergeSortIntr(arr,mid,end);

        merge(arr,beg,mid,end);
    }
    private  void merge(int[]arr,int beg,int mid,int end ){
       int[] input=new int[end-beg];
       int index=0;
       int cur1=beg;
       int cur2=mid;
       while(cur1<mid && cur2<end){
           if(arr[cur1]<=arr[cur2]){
               input[index++]=arr[cur1++];
           }else{
               input[index++]=arr[cur2++];
           }
           while(cur1<mid){
               input[index++]=arr[cur1++];
           }
           while(cur2<end){
               input[index++]=arr[cur2++];
           }
           for(int i=0;i<end-beg;i++){
               arr[beg+i]=input[i];
           }
       }
    }
    //快速排序;
    public void quickSort(int[] arr){
        //用一个辅助方法完成递归;
        quickHelp(arr,0,arr.length-1);
    }
    private void quickHelp(int[] arr,int left,int right){
        if(left>=right){//当区间元素个数为一或0时,不需要排序;
            return ;
        }
        //对区间[left,right]进行整理,调整基准值的位置到index,再进行递归;
        int index=helper(arr,left,right);

        quickHelp(arr,left,index-1);
        quickHelp(arr,index+1,right);
    }
    private int helper(int[] arr,int left,int right){
        int start=left;
        int end=right;
        int base=arr[right];//取最右侧元素为基准值;
        while(start<end){
            //从左往右找比基准大的元素;
            while(start<end && arr[start]<=base){
                start++;
            }
            //从右往左找比基准值小的元素;
            while(start<end && arr[end]>=base){
                end--;
            }
            //当上面循环结束后,star指向比基准大的元素,end指向比基准值小的元素;或者二者重合;
            //交换两个数;
            swap(arr[start],arr[end]);
        }
        //循环结束后,star和end一定重合;交换其和基准值的位置;
        swap(arr[start],arr[right]);
        //返回star位置,完成一次调整
        // 此时,star左侧的元素小于等于star指向的元素小,star右侧元素一定大于等于star指向的元素;
        return start;
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
