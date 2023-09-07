package Multitasking2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      // multithreading = Process of executing multiple threads simultaneously
         //                 Helps  maximum  utilization of CPU
        //                Threads2 are independent, they dont affect the execution of other threads.
        //             An exception in one thread will not interrupt other threads
        //               useful for serving multiple clients, multiplayer games, or other mutually independent tasks.

        //1. Create a subclass of Thread
         MyThread thread1 = new MyThread();                   // First way  -- limited or constrained

        // or

        //2. implement Runnable interface and pass instance as an argument to Thread()
         MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1,"");       // Second way preferable bcus you can extend another class
        // OR Thread thread2 = new Thread(new MyRunnable(), "thread2");


        // Setting user threads to non-user threads
        thread1.setDaemon(true);
        thread2.setDaemon(true); // exception in thread main; jvm terminates bcus they were no more user threads; jvm  doesnt care about Daeomon running



        // Successfully Multithreaded -- thread1 and thread2 is user thread by default
        thread1.start();
        //thread1.join(3000); //calling thread(ex.main) wait until the specified thread dies or for x milliseconds                     //The calling thread that calls the calling method wait for a specified thread to die b4 it resumes
       thread2.start();
       System.out.println(1/0); // An exception in one thread will not interrupt other threads


    }

}
