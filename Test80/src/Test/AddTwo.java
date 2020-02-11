package Test;

public class AddTwo {
    public int[] addTwo(int[] arr,int tageg){
        int a=0;
        int b=0;
        for(a=0;a<arr.length-1;a++){
            for(b=a+1;b<arr.length;b++){
                if(arr[a]+arr[b]==tageg){
                    return new int[] {a,b};
                }
            }
        }
        return new int[] {-1};
    }

}
