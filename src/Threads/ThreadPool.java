package Threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1000),

                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return newThread(r);
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()
        );
        pool.execute(() -> {
            System.out.println(1);
        });
        pool.execute(() -> {
            System.out.println(2);
        });
        pool.execute(() -> {
            System.out.println(3);
        });
    }
}

