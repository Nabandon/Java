package Solution007;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

       StringBuilder s2=new StringBuilder();
        int i=0;
        int index=0;
        while(index<str.length()){
            int k=0;
            StringBuilder s1=new StringBuilder();
            if(index<str.length()&&str.charAt(index)<='9' && str.charAt(index)>='0') {
                while (index<str.length()&&str.charAt(index) <= '9' && str.charAt(index) >= '0') {
                    k++;
                    s1.append(str.charAt(index));
                    index++;
                }
            }
            if(k>i){
                i=k;
               s2=new StringBuilder();
               s2.append(s1);

            }

            index++;
        }

        System.out.println(s2.toString());
    }
}


