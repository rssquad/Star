class SingletonDesign {
    public static void main(String[] args) {

        // singletonImpl ts = singletonImpl.getInstance();
        // ts.testMe("From main");
        // to prevent copy of object using reflection, throws error from constructor

        MyThread t = new MyThread();
        t.start();
        MyThread t2 = new  MyThread();
        t2.start();

    }
}

class singletonImpl {

     static singletonImpl instance = null;
     int number = 0;

    private singletonImpl() {

    }

     static synchronized singletonImpl getInstance()
    {
        if(instance == null)
        {
            System.out.println("instance created::!");
            instance =  new singletonImpl();
        }
        return instance;
    }

    public void testMe(String message)
    {
        System.out.println("YEAHH Singleton calling..!!" + message + " : " +  number++);

    } 

    
}

class MyThread extends Thread {

    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            singletonImpl ts = singletonImpl.getInstance();
            ts.testMe("From MyThread");
        }
    }
}

class MyThread2 extends Thread {

    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            singletonImpl ts1 = singletonImpl.getInstance();
            ts1.testMe("From MyThread2");
        }
    }
}