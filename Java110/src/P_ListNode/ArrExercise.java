package P_ListNode;

public class ArrExercise {
    public  int findNum(int[] arr,int find){
        int left=0,right=arr.length-1;
        while (left<=right){
            int mind=left+(right-left)/2;
            if(arr[mind]<find){
                left=mind+1;
            }
             if(arr[mind]>find){
                right=mind-1;
            }else {
                return mind;
            }
        }
        return  -1;
    }
    private int maxFind(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    private double avg(int[] arr){
        double sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum/arr.length;
    }
    private boolean isSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    private void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int a=arr.length-1;a>bound;a--){
                if(arr[a]<arr[a-1]){
                    int tem=arr[a];
                    arr[a]=arr[a-1];
                    arr[a-1]=tem;
                }
            }
        }
    }
    private void reverse(int[] a){
        int l=0,right=a.length-1;
        while (l<right){
            int tem=a[l];
            a[l]=a[right];
            a[right]=tem;
            l++;
            right--;
        }
    }
    private void transform(int[] a){
        int[][] as=new int[][]{};
        int l=0,r=a.length-1;
        while (l<r){
            while (l<r && a[l]%2==0){
                l++;
            }
            while (l<r && a[r]%2!=0){
                r--;
            }
            int tem=a[l];
            a[l]=a[r];
            a[r]=tem;
        }
    }
}
