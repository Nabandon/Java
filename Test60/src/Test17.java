import java.util.Arrays;
public class Test17 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int ai=0;
        int bi=0;
        while(ai<a.length){
            int tmp=a[ai];
            a[ai]=b[bi];
            b[bi]=tmp;
            ai++;
            bi++;
        }
        System.out.println("a :"+ Arrays.toString(a));
        System.out.println("b :"+ Arrays.toString(b));
    }
}
