class DeclareByInterface
{
    public static void main(String args[]) throws InterruptedException
    {
        DemoDeclareByInterface ddi  = new DemoDeclareByInterface();
        Thread t = new Thread(ddi);
        t.start();
        // t.join();
        // t.yield();
        for(int j = 1; j<=10; j++)
        {
            System.out.println("MAIN THREAD : " + j);
        }
    }
}

class  DemoDeclareByInterface implements  Runnable  
{
    public static Th
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println("CHILD THREAD : " + i);
        }
    }
}