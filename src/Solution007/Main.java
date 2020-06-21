package Solution007;


import java.util.*;

public class Main {

        public static void main(String[] args){
            Scanner sca=new Scanner(System.in);
            while(sca.hasNext()){
                String str=sca.next();
                int len=sca.nextInt();
                if(str.length()<len){
                    return;
                }
                int index=0;
                int max=0;
                for(int i=0;i<str.length()-len;i++){
                    int maxt=0;
                    for(int j=i;j<i+len;j++){
                        if(str.charAt(j)=='G' || str.charAt(j)=='C'){
                            maxt++;
                        }
                    }
                    if(maxt>max){
                        max=maxt;
                        index=i;
                    }
                }
                System.out.println(str.substring(index,index+len));
            }
        }
    }





