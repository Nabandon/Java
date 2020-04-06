package Solution1;

public class Heap {
    //通过size指定数组arr中有效堆元素;index是开始调整的节点;
    //左右子树必须都是堆才能进行调整;
    public void shiftDown(int[] arr,int size,int index){
        int parent=index;//记录父节点
        int child=parent*2+1;//记录对应的子节点;
        while(child<size){
            //找到左右子树中较小的值;
            if(child+1<size && arr[child+1]<arr[child]){
                child=child+1;
            }
            if(arr[child]<arr[parent]){ //比较child位置和parent的位置,是否符合小堆;
                int temp=arr[child];
                arr[child]=arr[parent];
                arr[parent]=temp;
            }else{
                break;//不需要调整了;
            }
            //更新parent和child;
            parent=child;
            child=parent*2+1;
        }
    }
    public void creatHeap(int[] arr,int size){
        for(int i=(size-1)/2;i>=0;i--){
            shiftDown(arr,size,i);
        }
    }
}
