package Solution007;


import java.util.Scanner;

public class Main {
    public String[] getGray(int n) {
        // write code here
        String[] str=null;
        if(n==1){
            str= new String[]{"0","1"};
        }else{
            String[] res=getGray(n-1);
            str=new String[res.length*2];
            for(int i=0;i<res.length;i++){
                str[i]="0"+res[i];
                str[str.length-1-i]="1"+res[i];
            }

        }
        return str;
    }

}







