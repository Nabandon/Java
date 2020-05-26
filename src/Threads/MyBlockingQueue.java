package Threads;

public class MyBlockingQueue<T> {

    private Object[] table;
    private int takeIndex;
    private int putIndex;
    private int size;
    public MyBlockingQueue (int  capacity){
        table=new Object[capacity];
    }
    private synchronized  void put (T type) throws InterruptedException {
        while(size==table.length){
            wait ();
        }
        table[putIndex]=type;
        putIndex=(putIndex+1)%table.length;
        size++;
        notifyAll();
    }
    private synchronized T take() throws InterruptedException {
        while(size==0){
            wait();
        }
        Object t=table[takeIndex];
        takeIndex=(takeIndex+1)%table.length;
        size--;
        notifyAll();
        return (T)t;
    }
    private int getSize(){
        return size;
    }

    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue=new MyBlockingQueue<>(100);
        for(int i=0;i<5;i++){
            new Thread(()->{
                while (true){
                    synchronized (queue){
                        try {
                            queue.put(1);
                            System.out.println("面包+1,库存:"+queue.getSize());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        for(int i=0;i<20;i++){
            new Thread(()->{
                while(true){
                    synchronized (queue){
                        try {
                        Integer t=queue.take();
                        System.out.println("面包-1,库存:"+queue.getSize());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }).start();
        }
    }
}
