package l;

import java.util.Scanner;

public class JiaMi {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String s1=sca.next();
            String s2=sca.next();
            Encrypt(s1);
            unEncrypt(s2);
        }
    }
    private static void Encrypt(String s){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String t="";
            if(c>='a' && c<'z'){
                c=(char)(c+1);
                t=(c+"").toUpperCase();
            }else if(c=='z'){
                c='a';
                t=(c+"").toUpperCase();
            }
            if(c>='A' && c<'Z'){
                c=(char)(c+1);
                t=(c+"").toLowerCase();
            }else if(c=='Z'){
                c='A';
                t=(c+"").toLowerCase();
            }
            if(c<='9' && c>='0'){
                int n=(c+1-'0')%10;
                t=n+"";
            }
            if(t!=""){
                str.append(t);
            }else{
                str.append(c);
            }
        }
        System.out.println(str.toString());
    }
    private static void unEncrypt(String s){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String t="";
            if(c>'a' && c<='z'){
                c=(char)(c-1);
                t=(c+"").toUpperCase();
            }else if(c=='a'){
                c='z';
                t=(c+"").toUpperCase();
            }
            if(c>'A' && c<='Z'){
                c=(char)(c-1);
                t=(c+"").toLowerCase();
            }else if(c=='A'){
                c='Z';
                t=(c+"").toLowerCase();
            }
            if(c<='9' && c>'0'){
                int n=(c-1-'0');
                t=n+"";
            }
            if(c=='0'){
                t=9+"";
            }
            if(t!=""){
                str.append(t);
            }else{
                str.append(c);
            }
        }
        System.out.println(str.toString());
    }
}