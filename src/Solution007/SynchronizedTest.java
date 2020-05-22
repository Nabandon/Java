package Solution007;

public class SynchronizedTest {

    private Object o=new Object();
    private static Object t=new SynchronizedTest();
    public void T3(){
        synchronized (o){
            int n=10;
            System.out.println(++n);
        }
    }
    private void T4(){
        synchronized (t){
            int n=10;
            System.out.println(++n);
        }
    }
    public static synchronized void T2(){
        int n=10;
        System.out.println(++n);
    }

}
