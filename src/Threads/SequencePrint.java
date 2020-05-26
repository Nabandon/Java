package Threads;

public class SequencePrint {

    private static void print1(){
        Thread t1=new Thread(new Print("A",null));
        Thread t2=new Thread(new Print("B",t1));
        Thread t3=new Thread(new Print("C",t2));
        t1.start();
        t2.start();
        t3.start();
    }
    private static class Print implements Runnable{
        String p;
        Thread t;
       private Print(String p,Thread t){
            this.p=p;
            this.t=t;
        }
        @Override
        public void run() {
            if(t!=null){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        // print1();
        print2();
    }

    private static void print2(){
            for(int i=0;i<Print2.ARR.length;i++){
                new Thread(new Print2(i)).start();
            }
    }
    private static class Print2 implements Runnable{
            int index;
            static String[] ARR={"A","B","C"};
            static int indexArr;
            public Print2(int index){
                this.index=index;
            }
        @Override
        public void run() {
            try {
            for (int i = 0; i < 10; i++) {
                synchronized (ARR) {
                    while (index != indexArr) {
                        ARR.wait();
                    }
                    System.out.print(ARR[index]);
                    if (indexArr == ARR.length - 1) {
                        System.out.println(i);
                    }
                    indexArr = (indexArr + 1) % ARR.length;
                    ARR.notifyAll();
                }
              }
            }catch (InterruptedException e) {
                e.printStackTrace();
          }
       }
   }
}
