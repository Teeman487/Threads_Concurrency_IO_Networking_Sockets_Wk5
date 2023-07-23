package MultiThreadingClass1;

public class Stack {
    private int[] array;
    private int stackTop;   //variable of Stack
    Object lock;
    //Object lock2;
    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();   // Create instance of lock
        //lock2 = new Object();
    }
    // t1, t2, t3
    public synchronized boolean push(int element) {  // is changing the state of the Stack object // and you cant allow multiple threads to change the cuurent state in such a way bcus if you allow multiple threads to have access to functions that keep changing your state then you will run into incosistency soon
      // synchronized (Stack.class)   // inside for static synchronized
       // synchronized (Stack.class) {   // inside for sync synchronized
          //  synchronized(lock) {  // lock
          if (isFull()) return false;  // intention: if Stack isFull(true) ; you cant push(false)
          else
              ++stackTop;  // 0  // stackTop = stackTop + 1 = -1+1=0  //Since Stack !isFull hence stackTop will increase
          try {
              Thread.sleep(1000);
          } catch (Exception e) {
          }
          array[stackTop] = element; //// array[0] = 1  // collecting element or variable into array collection // place element inline with stackTop
          return true;   //   Since Stack !isFull, you can push
          // }
      }
    // t1, t4, t5
    public synchronized int pop() { // is changing the state of the current object
        synchronized (this) { // this instance of the current object is use as a lock
            // synchronized (lock) {
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];  // array[-1]
            array[stackTop] = Integer.MIN_VALUE; // array[-1] = -2147483648
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            stackTop--; // stackTop = stackTop - 1 = -1 -1 =-2
            return obj;  // array[-2]
            // }
        }
    }

    public boolean isEmpty() { // not changing or updating the current state of the object(Stack)
        return stackTop < 0 ;   // return true  -1<0     ---true object Stack isEmpty
    }

    public boolean isFull() { // not changing or updating the current state of the object(Stack)
     return stackTop >= array.length -1;    // return false  -1>=1-1  ---false object Stack is not Full
    }

}
