package Solution007;

public class SignalTest {
    private static int SUM;//上限100,下线0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {//五个生产者;
            new Thread(() -> {
                try {
                    while (true) {
                        synchronized (SignalTest.class) {
                            if (SUM + 3 > 100) {
                                SignalTest.class.wait();
                            } else {
                                SUM += 3;
                                System.out.println(Thread.currentThread().getName() + ":" + SUM);
                                Thread.sleep(200);
                                //SignalTest.class.notify();
                                SignalTest.class.notifyAll();
                            }
                        }
                    Thread.sleep(200);
                        }
                    } catch(InterruptedException e){
                    e.printStackTrace();
                }
            },"师傅"+i).start();
        }
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        synchronized (SignalTest.class) {
                            if (SUM == 0) {
                                SignalTest.class.wait();
                            } else {
                                SUM--;
                                System.out.println(Thread.currentThread().getName() + ":" + SUM);
                                Thread.sleep(200);
                                //SignalTest.class.notify();
                                SignalTest.class.notifyAll();
                            }
                        }
                        Thread.sleep(200);
                    }
                }catch (InterruptedException e) {
                e.printStackTrace();
            }
            },"消费者"+i).start();
        }

    }
}
