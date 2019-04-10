
// https://www.youtube.com/watch?v=UOr9kMCCa5g

/* we can use notify for to give nitification for only one wauting threads 
if multiple threads are waitng than only one thread will be notify and 
the remaining threads have to wait for further notifications. 
which thread will be notify we can not expect it depends on thres jvm */

import java.util.LinkedList;
class MyBlockingQueue
{
    private Queue<E> queue;
    private int max = 16;
    private Object notEmpty = new Object();
    private Object notFull = new Object();

    
    public MyBlockingQueue(int size)
    {
        queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e)
    {
        synchronized(MyBlockingQueue.class)
        {
            while(queue.size() == max)
            {
                // block thread until queue has atleast 1 empty slot to add item
                notFull.wait();
            }
            queue.add(e);
            notEmpty.notifyAll();
        }
        
    }

    public E take()
    {
        synchronized(MyBlockingQueue.class)
        {
            while(queue.size() == 0)
            {
                // block thread untile queue has atleat 1 item to remove
                notEmpty.wait();
            }
            E item = queue.remove();
            notFull.notifyAll();
            return item;
        }
       
    }
}