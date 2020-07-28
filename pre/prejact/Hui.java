package prejact;

import java.util.Scanner;

public class Hui {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int t=sca.nextInt();
        for(int i=0;i<t;i++){
            String str=sca.next();
            System.out.println(p(str));
        }
    }
    private static int p(String str){
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                for(int i=0;i<str.length();i++){
                    if(remove(str.substring(0,i)+str.substring(i+1))){
                        return i;
                    }
                }

            }
            left++;
            right--;
        }
        return -1;
    }
    private static boolean remove(String str){
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
