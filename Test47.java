import java.util.Arrays;
public class Test47{
    public static void main(String[] args){
        int[] arr={1,3,5,3,1};
        px(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void px(int[] arr1){
        for(int a=0;a<arr1.length;a++){
            for(int b=arr1.length-1;b>a;b--){
                if(arr1[b-1]>arr1[b]){
                    int tmp=arr1[b-1];
                    arr1[b-1]=arr1[b];
                    arr1[b]=tmp;

                }
            }
        }
    }
}