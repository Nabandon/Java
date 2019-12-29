public class PrintArrays{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        printarray(arr);
    }
    public static void printarray(int a[]){
        for(int x:a){
            System.out.println(x);
        }
    }
}