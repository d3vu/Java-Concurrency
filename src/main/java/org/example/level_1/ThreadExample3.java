package org.example.level_1;


public class ThreadExample3 {

    public static class MyRunnable implements Runnable{
        public void run()
        {
            System.out.println("My Runnable Running");
            System.out.println("My Runnable Finised");
        }
    }

    public static void main(String[] args) {
        System.out.println("Thread Example3");
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
