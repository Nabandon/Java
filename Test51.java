import java.util.Arrays;

public class Test51{
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2=trangsform(arr1);
        print(arr2);
    }
    public static int[] trangsform(int[] arr3){
        int[] arr4=new int[arr3.length];
        for(int i=0;i<arr3.length;i++){
            arr4[i]=arr3[i]*2;
        }
        return arr4;
    }
    public static void print(int[] arr5){
      System.out.print(Arrays.toString(arr5));
    }
}