 public class Test52{
     public static void main(String[] args) {
         int[] arr1={1,2,3,4,5};
         System.out.println(trans(arr1));
     }
     public static String trans(int[] arr2){
         String ret="[";
         for(int i=0;i<arr2.length;i++){
             ret+=arr2[i];
             if(i<arr2.length-1){
                 ret+=',';
             } 
         }
         ret+="]";
         return ret;
     }
 }