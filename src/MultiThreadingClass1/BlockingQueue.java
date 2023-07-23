package MultiThreadingClass1;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
   private Queue<Integer> q;
   private int capacity;
   public BlockingQueue(int cap)
   {
       q = new LinkedList<>();
       capacity = cap;
   }
   public  boolean add(int item)
   {
       synchronized (q) {
    if (q.size() == capacity)
        q.add(item);
    return true;
       }
   }
   /*public int remove()
   {
       synchronized (q) {
if(q.size() == 0)
    // do something

    int element = q.poll();
return element;
       }
   }*/
}
