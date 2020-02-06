package Test;

public class Bull {
    public void bull(int[] arr){
        int l=0;
        int r=arr.length-1;
        for(l=0;l<arr.length;l++){
            for(r=arr.length-1;r>l;r--){
                if(arr[r]<arr[r-1]){
                    int temp=arr[r];
                    arr[r]=arr[r-1];
                    arr[r-1]=temp;
                }
            }
        }
    }
}
