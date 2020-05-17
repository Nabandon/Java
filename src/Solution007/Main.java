package Solution007;

public class Main {
    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("thread");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            int j=i;
           Thread t= new Thread(new Runnable() {

                @Override
                public void run() {

                    System.out.println(j);
                }
            },"one");
                t.start();
                threads[i]=t;

        }
        for(int i=0;i<20;i++){
            threads[i].join();
        }
        System.out.println("m");
    }
}
