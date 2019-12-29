public class Test40{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int ret=sum(arr);
        System.out.println(ret);
    }
    public static int sum(int[] a){
        int ret2=0;
        for(int x:a){
            ret2+=x;
        }
        return ret2;
    }
}