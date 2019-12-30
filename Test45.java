public class Test45{
    public static void main(String[] args){
        int[] arr={1,2,4};
       System.out.println(xu(arr));
    }
    public static boolean xu(int[]arr1){
        int i=0;
        while(i<arr1.length-1){
            if(arr1[i]>arr1[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}