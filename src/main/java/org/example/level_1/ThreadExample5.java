package org.example.level_1;

public class ThreadExample5 {

    public static void main(String[] args) {
        Runnable runnable = ()->
        {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" Running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadName+" Finished");
        };

        Thread thread = new Thread(runnable,"Dev Thread 1");
        thread.start();

        Thread thread2 = new Thread(runnable,"Dev Thread 2");
        thread2.start();
    }
}
