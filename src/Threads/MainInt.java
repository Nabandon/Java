package Threads;

import java.util.Scanner;

public class MainInt {
    public static void main(String[] args){

        print();
    }
    private static void print(){
        for(int i=0;i<4;i++){
            new Thread(new print2(i)).start();
        }
    }
    public static class print2 implements Runnable{
       static Scanner s=new Scanner(System.in);
         static int num=s.nextInt();

        int index;
        static  String[] arr={"A","B","C","D"};
        static int aindex;
        public print2(int index){
            this.index=index;
        }
        @Override
        public void run(){
            try{
                for(int i=0;i<num;i++){
                    synchronized(arr){
                        while(index!=aindex){
                            arr.wait();
                        }
                        System.out.print(arr[aindex]);
                        aindex=(aindex+1)%4;
                        arr.notifyAll();
                    }
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
