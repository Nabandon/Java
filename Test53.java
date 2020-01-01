import java.util.Arrays;
public class Test53{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] a1=   Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(a1));
        a[0]=10;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
        int[] a2=   Arrays.copyOfRange(a,1,3);
        System.out.println(Arrays.toString(a2));
    }
}