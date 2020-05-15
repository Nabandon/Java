package one;

public class o {
    public static void main(String[] args) throws InterruptedException {
        //1.
        //    Thread.sleep(9999999L);
        //2.
//        new Thread (new Runnable(){
//
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(9999999L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"number one").start();
//        Thread.sleep(9999999L);
//       Thread t= new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(9999999L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"number one");
//        t.run();
//    }
        new Thread (new Runnable(){

            @Override
            public void run() {
                System.out.println("一");
            }
        },"一").start();
        System.out.printf("main");
    }
}
