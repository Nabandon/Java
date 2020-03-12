package Test222;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,10,11,7,12,6,7,16,18,19};

        System.out.println(Arrays.toString(subSort(arr)));
    }

    public static int[] subSort(int[] array) {
        if (array.length < 2) return array;
        int left = 0;
        int right = array.length-1;
        while (left < array.length-1 && array[left] <= array[left + 1]) {
            left++;
        }
        while (right > 0 && array[right] >= array[right - 1]) {
            right--;
        }
        if (left >= right) return new int[]{-1, -1};
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int k=left;k<=right;k++){
            max=Math.max(array[k],max);
            min=Math.min(array[k],min);
        }
        while(left>=0&&array[left]>min){
            left--;
        }
        while(right<array.length && array[right]<max){
            right++;
        }
        return new int[]{left+1,right-1};
    }
}
