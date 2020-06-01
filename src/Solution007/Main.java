package Solution007;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int num=help(A,B);
        System.out.println(num);
    }
    private static int help(String a,String b){
        ArrayList<Character> list=new ArrayList<>();
        int lena=a.length();
        int lenb=b.length();
        int num=0;
        for(int i=0;i<=lena;i++){
            list.clear();
            for(int k=0;k<lena;k++){
                list.add(a.charAt(k));
            }
            for(int j=b.length()-1;j>=0;j--){
                list.add(i,b.charAt(j));
            }
            if(palindrome(list,lena+lenb)){
                num++;
            }
        }
        return num;
    }
    private static boolean palindrome(ArrayList list,int len){
        int left=0;
        int right=len-1;
        while(left<=right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


