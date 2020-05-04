package Solution1;

import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        for(int i=0;i<num;i++){
            int len=sca.nextInt();
            String str=sca.next();
            int count=0;
            for(int j=0;j<len;j++){
                if(str.charAt(j)=='.'){
                    count++;
                    j+=2;
                }
            }
            System.out.println(count);
        }
    }
}
