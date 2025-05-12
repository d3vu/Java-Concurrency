package org.example.level_1;


// Code to show how to stop a thread
public class ThreadExample6 {

   public static class StoppableRunnable implements Runnable{
       private boolean stop = false;

       public synchronized void setStop()
       {
           this.stop = true;
       }

       public synchronized boolean isStoped()
       {
           return  this.stop;
       }

       private void sleep(long millis)
       {
           try
           {
               Thread.sleep(millis);
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
       }

       @Override
       public void run() {
           System.out.println("StoppableRunnable Running");
           while(!isStoped())
           {
               sleep(1000);
               System.out.println("...");
           }
           System.out.println("StoppableRunnable Stopped");
       }

       public static void main(String[] args) {
           StoppableRunnable stoppableRunnable = new StoppableRunnable();
           Thread thread = new Thread(stoppableRunnable);
           thread.start();

           try
           {
               Thread.sleep(5000);
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }

           System.out.println(" reuesting Stop");
           stoppableRunnable.setStop();
           System.out.println("Stop reuested");
       }
   }
}
