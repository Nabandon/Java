package Solution007;

public class IsSafeThread {
    private static int SUM=0;
    private synchronized static void res(){
        SUM++;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10;j++){
                        res();
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(SUM);
    }
}
