package Java0113;

import java.util.Arrays;

class remove2{
    public  static void removeElement(int[] nums) {
        int i = 0;
        int n = nums.length;
            nums[i] = nums[n - 1];
        System.out.println(Arrays.toString(nums));
        }
    }
public class T13 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        remove2.removeElement(arr);
    }
}
