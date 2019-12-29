public class Test41{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(avg(arr));
    }
    public static double avg(int[] a){
        int ret=0;
        double sum;
        for(int x:a){
            ret+=x;
        }
        sum=ret/a.length;
        return sum;
    }
}