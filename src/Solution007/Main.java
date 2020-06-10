package Solution007;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        String str="";
        while(n/10!=0){
            int w=n%10;
            str+=w;
            n/=10;
        }
        str+=n;
        System.out.println(str);
    }
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if (nums1.length > nums2.length) {
//            return findMedianSortedArrays(nums2, nums1);
//        }
//        int m = nums1.length;
//        int n = nums2.length;
//        int left = 0, right = m  ;
//        int median1 = 0, median2 = 0;
//        while (left <= right) {
//            int i = (left + right) / 2;
//            int j = (m + n + 1) / 2 - i;
//
//            int nums_im1 = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
//            int nums_i = (i == m ? Integer.MAX_VALUE : nums1[i]);
//            int nums_jm1 = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
//            int nums_j = (j == n ? Integer.MAX_VALUE : nums2[j]);
//
//            if (nums_im1 <= nums_j) {
//
//                median1 = Math.max(nums_im1, nums_jm1);
//                median2 = Math.min(nums_i, nums_j);
//                left = i + 1;
//            } else {
//                right = i - 1;
//            }
//        }
//        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(sum(0,0,arr));
//    }
//    private static int sum(int i,int res,int[] arr){
//        if(res==40){
//            return 1;
//        }
//        if(i==arr.length || res>40 ){
//            return 0;
//        }
//        return sum(i+1,res,arr)+sum(i+1,res+arr[i],arr);
//    }
//    public static void main(String[] args){
//        Scanner sca=new Scanner(System.in);
//        while(sca.hasNext()){
//            String s1=sca.nextLine();
//            String s2=sca.nextLine();
//            StringBuilder str=new StringBuilder();
//            for(int i=0;i<s1.length();i++){
//                if(!s2.contains(s1.charAt(i)+"")){
//                    str.append(s1.charAt(i));
//                }
//
//            }
//            System.out.println(str.toString());
//        }
//    }
    }





