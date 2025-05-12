package org.example;

public class ThreadExample4 {


    // Annoymous
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable Running");
                System.out.println("My Runnable Finised");
            }
        };

        Thread thread = new Thread(runnable);
        thread.run();


    }
}
