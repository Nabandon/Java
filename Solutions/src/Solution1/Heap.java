package Solution1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Pairs implements Comparable<Pairs>{
    public int x;
    public int y;
    public int sum;
    public Pairs(int x, int y) {
        this.x = x;
        this.y = y;
        this.sum=x+y;
    }

    @Override
    public int compareTo(Pairs pairs) {
        return this.sum-pairs.sum;
    }
}
public class Heap {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums1.length==0||nums2.length==0||k<=0) return res;
        PriorityQueue<Pairs> queue=new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                queue.offer(new Pairs(nums1[i],nums2[j]));
            }
        }
        for(int n=0;n<k && !queue.isEmpty();n++){
            Pairs cur=queue.poll();
            List<Integer> temp=new ArrayList<>();
            temp.add(cur.x); temp.add(cur.y);
            res.add(temp);
        }
        return res;
    }
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
