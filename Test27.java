class Test27{
    public static void main(String[] args) {
        
        int []arr={10,20};
        swap(arr);
        System.out.println("a="+arr[0]+" b="+arr[1]);

    }
    public static void swap(int []arr){
        int tmp=arr[0];
        arr[0]=arr[1];
        arr[1]=tmp;
    }
}