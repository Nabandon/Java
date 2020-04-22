package Solution1;

import Solution2.TreeNode;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;


public class Java_0402 {
    public String largestNumber(int[] nums) {
        if(nums.length==0) return null;
       String[] str=new String[nums.length];
       for(int i=0;i<nums.length;i++){
           str[i]=String.valueOf(nums[i]);
       }
       Arrays.sort(str,(o1,o2)->(o2+o1).compareTo(o1+o2));
       StringBuilder sb=new StringBuilder();
       for(String s:str){
           sb.append(s);
       }
       String res=sb.toString();
       if(res.charAt(0)=='0') return "0";
       return res;
    }

    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int i=1;
        int[] res=new int[index];
        res[0]=1;
        int i2=0;
        int i3=0;
        int i5=0;
        while(i<index){
            int tem=Math.min(Math.min(res[i2]*2,res[i3]*3),res[i5]*5);
            if(tem==res[i2]*2) i2++;
            if(tem==res[i3]*3) i3++;
            if(tem==res[i5]*5) i5++;
            res[i++]=tem;
        }
        return res[index-1];
    }
    public String PrintMinNumber(int [] numbers) {
        List<Integer> list=new ArrayList<>();
        for(int n:numbers){
            list.add(n);
        }
        Collections.sort(list,(o1,o2)->{
            String s1=o1+""+o2;
            String s2=o2+""+o1;
            return s1.compareTo(s2);
        });
        String str="";
        for(int x:list){
            str+=x;
        }
        return str;
    }
    public static void main(String[] args) {
        String s="qwer";

        System.out.println(s.substring(0,1));
    }
    //同构字符串;
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }else{
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public List<String> topKFrequent(String[] words,int k){
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(o1,o2)->{
            int count1=map.get(o1);
            int count2=map.get(o2);
            if(count1==(count2)){
                return o1.compareTo(o2);
            }
            return count2-count1;
        });
        return  list.subList(0,k);
    }
    public String[] findRelativeRanks(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        String[] str=new String[n];
        int j=n-1;
        for(int k=0;k<n;k++){
            if(j>=0){
                if(j==n-1){
                    str[map.get(nums[j])]="Gold Medal";
                }else if(j==n-2){
                    str[map.get(nums[j])]="Silver Medal";
                }else if(j==n-3){
                    str[map.get(nums[j])]="Bronze Medal";
                }else{
                    str[map.get(nums[j])]=String.valueOf(k+1);
                }
                j--;
            }
        }
        return str;
    }
}
