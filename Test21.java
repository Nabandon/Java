public class Test21{
    public static void main(String[] args) {
        int []arr={1,1,2,2,4,3,4,5,5};
        int i=0;
        int j=0;
        int count;
        for(i=0;i<9;i++){
            count =0;
            for(j=0;j<9;j++){
                if(arr[i]==arr[j])
                    count ++;
                
            }if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}