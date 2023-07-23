package Threads2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*thread = A thread of execution is a program(kind of like a virtual CPU)
            The JVM allows an application to have multiple threads running concurrently
                Each thread can execute parts of your code in parallel with the main thread
        Each thread has a () -> priorityThreads with higher priority are executed in preference compared to threads with lower priority
           The Java Virtual Machine continues to execute threads until either of the following occurs
             1. The exit method of class Runtime has been called
           2. All user threads have died

                when a JVM starts up, there is a thread which calls the main method
                This thread is called "main"
                Daemon thread is a low priority thread that runs in background to perform task such as garbage collection
                and JVM terminates itself when all user threads (non-daemon threads) finish their execution.
                */

        //1. Threads2 currently running
        //System.out.println(Thread.activeCount()); // 2 threads are currently running
        //Thread.currentThread().setName("MAIN");

        //2. Thread.currentThread() is the mainThread --Thread[#1,MAIN,5,main]
        //System.out.println( Thread.currentThread().getName()); // main|MAIN is the name of thread that is currently running

        //3. Priority of our main(Thread)
        Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority()); // 5 // 1O

        //4. Check if current thread is alive
        //System.out.println(Thread.currentThread().isAlive()); // true

        /*for (int i=3;i>0;i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("You are done!");*/


        MyThread thread2 = new MyThread();

        thread2.setDaemon(false); // we set thread to Daemon thread
        System.out.println(thread2.isDaemon()); // false-this thread is not a Daemon thread // is there Daemon, a non user thread
        thread2.start(); // This thread is running
        //System.out.println(thread2.isAlive()); // true: when you create a new thread, you need to start or run it to becoe alive
       // thread2.setName("2nd thread"); // 2nd thread
       // System.out.println(thread2.getName()); // Thread-0 --second thread
       // thread2.setPriority(1); // latest thread priority
        //System.out.println(thread2.getPriority()); // 5 it usually inherits priority of the thread that created it [main thread] -- 10

        System.out.println(Thread.activeCount()); // 2

    }
}
