package Solution1;

public class CountAndSay {
    public static void main(String[] args) {
        int len=0;
        int[] arr={};
        int[] d=new int[1];
        System.out.println(duplicate(arr,len,d));
    }
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] k = new boolean[length];
        for (int i = 0; i < length; i++) {
            int m=numbers[i];
            if (k[m] == true) {
                duplication[0] =m;
                return true;
            }
            k[m] = true;
        }
        return false;
    }
}
