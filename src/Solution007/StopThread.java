package Solution007;

import java.util.TreeMap;

public class StopThread {
    public static void main(String[] main) throws InterruptedException {
         int[] count = {0};
          Thread t=  new Thread( new Runnable() {
                @Override
                public void run() {
                        System.out.println(Thread.currentThread().isInterrupted());
                        System.out.println("分割线-----");
                    while (!Thread.currentThread().isInterrupted()) {
                        System.out.println("分割线2-----");
                        System.out.println(Thread.currentThread().isInterrupted());
                    }
                }
            });
                t.start();
                Thread.sleep(1);
                t.interrupt();
        }
    }

