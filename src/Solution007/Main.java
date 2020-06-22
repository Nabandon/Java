package Solution007;


import java.util.*;

public class Main {

//    public boolean[] chkSubStr(String[] p, int n, String s) {
//        // write code here
//        boolean[] b=new boolean[n];
//        if(n<=0 || s.length()<=0 ||s==null){
//            return b;
//        }
//        for(int i=0;i<n;i++){
//            boolean res=s.contains(p[i]);
//            b[i]=res;
//        }
//        return b;
//    }
public static void main(String[] args){
    Scanner sca=new Scanner(System.in);
    while(sca.hasNext()){
        int n=sca.nextInt();
        int des=sca.nextInt();
        int[] arr=new int[n];
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sca.next();
            arr[i]=sca.nextInt();
        }
        if(des==0){
            for(int j=0;j<n-1;j++){
                String st=str[j+1];
                int t=arr[j+1];
                int k=0;
                for(k=j+1;k>0;k--){
                    if(t>arr[k-1]){
                        arr[k]=arr[k-1];
                        str[k]=str[k-1];
                    }else{
                        arr[k]=t;
                        str[k]=st;
                        break;
                    }
                }
                arr[k]=t;
                str[k]=st;
            }
        }else{
            for(int j=0;j<n-1;j++){
                String st=str[j+1];
                int t=arr[j+1];
                int k=0;
                for(k=j+1;k>0;k--){
                    if(t<arr[k-1]){
                        arr[k]=arr[k-1];
                        str[k]=str[k-1];
                    }else{
                        arr[k]=t;
                        str[k]=st;
                        break;
                    }
                }
                arr[k]=t;
                str[k]=st;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(str[i]+" "+arr[i]);
        }
    }
}
    }





