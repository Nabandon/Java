import java.util.Arrays;
public class Test42{
    public static void main(String[] args){
        int[] a={1,2,3,4};
        String sum=toString(a);
        System.out.println(sum);
        
    }public static String toString(int[] arr){
        String ret="["; 
        int i;
        for(i=0;i<arr.length;i++){
            if(i<arr.length-1){
                ret+=arr[i]+" , ";
            }else if(i==arr.length-1){
                ret+=arr[i]+"]";
            }
            
        }return ret;
    }
}