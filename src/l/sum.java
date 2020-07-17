package l;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String[] str=sca.nextLine().split(";");

            int x=0,y=0;
            for(int i=0;i<str.length;i++){
                if( str[i]==null || str[i].length()<2 || str[i].length()>3 ){
                    continue;
                }else{
                    char c=str[i].charAt(0);
                    boolean f=true;
                    for(int j=1;j<str[i].length();j++){
                        if(str[i].charAt(j)>'9' || str[i].charAt(j)<'0'){
                            f=false;
                            break;
                        }
                    }
                    if(f){
                        int num=0;
                        if(str[i].length()>1)
                            num=Integer.parseInt(str[i].substring(1));
                        if(c=='A'){
                            x-=num;
                        }else if(c=='D'){
                            x+=num;
                        }else if(c=='W'){
                            y+=num;
                        }else if(c=='S'){
                            y-=num;
                        }
                    }


                }

            }
            System.out.println(x+","+y);
        }
    }
}
