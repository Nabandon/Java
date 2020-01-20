package Java0112;

public class FindShrtedSubarr {
    public static void main(String[] args) {
        int[] nums={2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
    public static int findUnsortedSubarray(int[] nums) {
            int left=0;
            int right=0;
        for (int a = nums.length - 1; a > 0; a--) {
            for (int b = a - 1; b >= 0; b--) {
                if (nums[a] < nums[b]) {
                    right = a + 1;
                    break;
                }
            }
        }
        for (int a2 = 0; a2 < nums.length - 1; a2++) {
            for (int b2 = a2 + 1; b2 < nums.length; b2++) {
                if (nums[b2] < nums[a2]) {
                    left = a2;
                    break;
                }
            }
        }
        if (right - left < 0) return 0;
        return right - left;
    }
}
