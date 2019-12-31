import java.util.Arrays;
public class Test49{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        nx(arr);
        System.err.println(Arrays.toString(arr));
    }
    public static void nx(int[] arr1){
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            int tmp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=tmp;
            left++;
            right--;
        }
    }
}