package MultiThreadingClass1;

// inbuilt Runnable is a function interface(bcus it has one abstract method that is running)
// main(Thread2) : second main(Thread)
/*public class Thread2 implements Runnable{
    @Override
    public void run() {

        for (int i =0; i<5;i++ )
            System.out.println(Thread.currentThread()+ "," +i);
        // Thread[#22,thread2,5,main],0   --- Thread[#22,thread2,5,main],4
    }
}*/

//       Lambda Expression of the above
/*  Runnable thread2 = new Thread2();
        Thread thread2 = new Thread(new Thread2(); "thread2");

           Thread thread2 = new Thread ( () ->
       {
              for (int i =0; i<5;i++ )
            System.out.println(Thread.currentThread()+ "," +i);
          },  "thread2"); */

