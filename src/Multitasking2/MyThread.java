package Multitasking2;

// 1 of 2 ways of creating a thread --Inheritance
public class MyThread extends Thread{
    @Override
    public void run() {
     for (int i=10;i>0;i--) {
       System.out.println("Thread #1:"+i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         //System.out.println(1/0);
     }
        System.out.println("Thread #1: is finished" );
    }
}
