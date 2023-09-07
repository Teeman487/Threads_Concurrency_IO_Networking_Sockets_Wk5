package MultiThreadingClass1;

public class Thread1 extends Thread { // Thread(main Thread -Parent class) is inbuilt, Thread1 as child class of main(Thread)
    //Constructor Overloading

    //Constructor of Thread1
    public Thread1(String threadNam) // Constructor overloading
    {
        super(threadNam); // threadName is a [String variable in main(Thread)]
    }


@Override
    public  void run()  // inbuilt run method in Thread(main) override by Thread1(child class)
{
    //Whatever piece of code we want to execute will be under run method --similar to psvm
   for (int i=0 ; i <5 ; i++) // 0 1 2 3 4 // looping 5 times
      // System.out.println("inside thread1 " + i);
      // System.out.println("inside " + Thread.currentThread().getName() + " " + i); // Thread.currentThread-static method - returns instance of current thread that is currently running
      //  inside thread1 0 --- inside thread1 4    currentThread.getName=thread1
       System.out.println("inside " + Thread.currentThread() + " " + i);
     // inside Thread[#22,thread1,5,main] 0  ----  inside Thread[#22,thread1,5,main] 4
    //                     threadName, thread priority, main(Thread)
}

}



/*
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
}*/






/*public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Thread #2:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #2: is finished" );
    }
}*/




