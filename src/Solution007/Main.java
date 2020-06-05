package Solution007;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(0,0,arr));
    }
    private static int sum(int i,int res,int[] arr){
        if(res==40){
            return 1;
        }
        if(i==arr.length || res>40 ){
            return 0;
        }
        return sum(i+1,res,arr)+sum(i+1,res+arr[i],arr);
    }
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





