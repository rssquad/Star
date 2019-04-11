
//We can not set main thread as daemon thread because main thread start by JVM once it come to user thread already start
//  so it is imposible to vhange main thread beacuse already started by jvm at the begging 
class Daemon
{
    public static void main (String[] args)
    {
       /*  System.out.println(Thread.currentThread().isDaemon());
        // Thread.currentThread().setDaemon(true);  // Exception

        MyThread t = new MyThread();
        t.setDaemon(true);
        System.out.println("Is MyThread Daemon thread " + t.isDaemon()); */

        MyThread t = new MyThread();
        t.setDaemon(true);  //if we comment this line both main and child threads are non daemon and hence both treads will be execution untill thaer complition,
        //  if we are not comment this line than main tread is non daemon and child thread is daemon  heance when ever main thread is teminate automatically child thread will be terminated
        // in this case o/p is end of main thread /n child thread OR end of main thread 
        t.start();
        System.out.println("End of mian thread");
    }
}

class MyThread  extends Thread{

    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Child thread");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

}