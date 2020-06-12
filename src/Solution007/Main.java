package Solution007;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String s=sca.nextLine();
            int[] arr=new int[10];
            for(int i=0;i<s.length();i++){

                arr[Integer.parseInt(s.charAt(i)+"")]++;
            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=0){
                    System.out.println(j+":"+arr[j]);
                }
            }

        }

    }

}







