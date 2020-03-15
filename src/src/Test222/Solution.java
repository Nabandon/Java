package Test222;

import java.util.*;

class Example {

    public static void main(String args[]) {
//        Example ex = new Example();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
//    }
//    public void change(String str,char ch[ ]){
//        str = "test ok";
//        ch[0] = 'g';
//    }
//    public int indexOf(String str,int fromIdex){
//       return str.indexOf("word",fromIdex);
//    }
//    public String replace(String regex,String replacement){
//        String all=regex.replaceAll("w","x");
//        String first=regex.replaceFirst("w","x");
//        return "wx";
//    }
//    public boolean contain(String s){
//
//        return s.contains(".m");
        // }
 //        public int compareTo () {
        System.out.println( "asd".compareTo("qwe"));
    }
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int i=0;int j=0;int ans=0;
        while(i<n && j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


}
//


