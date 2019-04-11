class SingletonDoubleCheck {
    public static void main(String[] args) {

        // singletonImpl ts = singletonImpl.getInstance();
        // ts.testMe("From main");

        MyThreadEx t = new MyThreadEx();
        t.start();
        MyThreadEx2 t2 = new MyThreadEx2();
        t2.start();

    }
}

class singletonImpl {

    private static final singletonImpl instance = new singletonImpl(); ;
    int number = 0;

    private singletonImpl() {

    }

    static synchronized singletonImpl getInstance()
    {
        // Using doble check
       /*  if(instance == null)
        {
            synchronized (singletonImpl.class)
            {
                if(instance == null)
                {
                    System.out.println("instance created::!");

                instance =  new singletonImpl();
                }

                
            }

          
            
        } */
        System.out.println("instance created::!");
        return instance; }
 
    public void testMe(String message)
    {
        System.out.println("I am Calling " + message);
    } 

    
}
 class MyThreadEx extends Thread {
  public void run()
    {
        singletonImpl ts = singletonImpl.getInstance();
        for(int i = 0; i < 10; i++)
        {
           
            ts.testMe("From MyThreadEx");
        }
    }
}
 class MyThreadEx2 extends Thread {
  public void run()
    {singletonImpl ts1 = singletonImpl.getInstance();
        for(int i = 0; i < 10; i++)
        {
            
            ts1.testMe("From MyThreadEx2");
        }
    }
}