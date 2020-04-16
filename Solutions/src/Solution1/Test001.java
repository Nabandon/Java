package Solution1;

import java.util.*;

public class Test001 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        int k = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (list.contains(nums2[j])) {
                nums1[k++] = nums2[j];
                Integer t = nums2[j];
                list.remove(t);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        int k = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                nums1[k++] = nums2[j];
                set.remove(nums2[j]);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
