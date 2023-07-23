package MultiThreadingClass1;
// user thread1 = not running        user thread1=not run       user thread1 = dies             user thread1 = exists
// Daemon thread = run               Program     = run          Daemon thread = no exists        Program   =  might not run
// If there is no user thread(thread1) running it is up to the mercy of JVA to either run the  Daemon thread or let the Daemon thread run or continue its job
// A program will only run if there is no user thread running even if there are couples of Daemon threads running and no user thread runnung, the program my dominate
// if the user thread dies, Daemon thread has no existence functionality
// program will not keep running if the user Thread exists. might not run if the Demon thread exist without the User Thread
/*
public class ThreadTester {
    public static void main(String[] args) {
        // Instantiate .... Thread is called (main Thread) or Parent class | Thread1 is child class
        System.out.println("main(Thread) is starting"); // Meaning: untill the main(Thread) starts b4 Thread1(child class - run()) executes

        //Task1: First way to create Thread: Multiple Inheriances Constructor Overloading Method from[public class Thread1 extends Thread]
        // Constraint: multiple inheritances is not supported in java --there is constraint to our design

        */
/*Thread thread1 = new Thread1("thread1");// First|Current Thread name - thread1
        // thread1(user) is always associated with Thread(main) // crossing (main Thread | Parent class) to child class(Thread1)
       // thread1.setDaemon(false); // (Daemon) false notequal true  --Daemon thread not run --user thread will run
        thread1.start();   // (user)thread1.start(inside Thread1) will start|call or run method(public void run()) in Thread1
*//*

      //Task2a: Second way to create Thread--most suitable way from [public class Thread2 implements Runnable]
      //multiple interfaces is supported in Java ---No constrain in implementation
     //   Thread thread2 = new Thread(new Thread2(), "thread2"); // instance of main(Thread-Parent1) + a main(Thread-Parent2)
            // thread2.start


    // //Task2b: Second way to create Thread with LAMBDA Function
        Thread thread2 = new Thread ( () ->
        {
            for (int i =0; i<5;i++ )
                System.out.println(Thread.currentThread()+ "," +i);
        },   "thread2");
        thread2.start();


        System.out.println("main(Thread) is existing");

        new Thread().run();  //once Thread implements Runnable 4sure is it will give complete implementation of the run() method


    // if main(Thread) stops executing, it might happen that entire thread1(user) will not continue printing entire file values
    // if there is any user thread1 running, the program will not terminate, even if it means the main(Thread) has finished executing
    // if there are user thread running, the program will continue to run, till all user thread finishes it job
    // if there is no user thread1 running, it might not allow Daemon thread continue it job


        //thread1.setDaemon(false);// click 2 // returns boolean result
        // 2 threads will be running, the main Thread & Thread1

       */
/* Click 2 Result
        Thread-0,5--threadName      main--ParentThread

       insideThread[#22,Thread-0,5,main] 0
        insideThread[#22,Thread-0,5,main] 1
        insideThread[#22,Thread-0,5,main] 2
        insideThread[#22,Thread-0,5,main] 3
        insideThread[#22,Thread-0,5,main] 4*//*





        */
/* Click 1 Result
         main is starting
        main is existing
        ------------------
        inside thread1 0
        inside thread1 1
        inside thread1 2
        inside thread1 3
        inside thread1 4
        *//*



        //thread1.setDaemon(false);




       */
/* Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();*//*


        */
/*Thread[#22,thread2,5,main],0
        Thread[#22,thread2,5,main],1
        Thread[#22,thread2,5,main],2
        Thread[#22,thread2,5,main],3
        Thread[#22,thread2,5,main],4*//*


        */
/*Thread thread2 = new Thread(() -> {  // constructor accepts implementation of runnable interface
            for (int i =0; i<5;i++ )
                System.out.println(Thread.currentThread()+ "," +i);
        },"thread2");
        thread2.start();*//*



        */
/*System.out.println("main is existing");
        new Thread().run();*//*


    }
}
*/
