package org.example.level_1;

public class ThreadExample2 {

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread Finished");
        }
    }
    public static void main(String[] args) {
        System.out.println("ThreadExample2");
        Thread thread = new MyThread();
        thread.start();
    }
}
