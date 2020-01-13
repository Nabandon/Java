package Java0112;

public class T1 {
    public static int[] arrymove(int arr[],int k){
        int temp[]=new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        k=k%arr.length;
        int t=0;
        for(int i=0;i<arr.length;i++){
            t=(i+k)%arr.length;
            arr[t]=temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int arry[]=arrymove(arr, k);
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
}
