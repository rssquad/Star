class Declare 
{
    public static void main(String[] args)
    {
        DeclareDemo dd = new DeclareDemo();
        dd.start();
        for(int i= 0; i<=10; i++)
        {
            System.out.println("MAIN THREAD COUNT IS HERE : "+ i);
        }
    }
}

class DeclareDemo extends Thread
{
        public void run()
        {
            for(int i=0; i<=10; i++)
            {
                System.out.println("CHILED COUNT IS HERE : " + i);
            }
        }
}