class A
{
    public synchronized void  d1(B b)
    {
        System.out.println("Class A's D1 method");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("A tring to call B's last method");
        b.last();
    }

    public synchronized void last()
    {
        System.out.println("Class A's last method calling from B");
    }
}

class B{

    public synchronized void d2(A a)
    {
        System.out.println("Class B's D2 method");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("B tring to call A's last method");
        a.last();
    }
    public synchronized void last()
    {
        System.out.println("Class B' last method calling from a");
    }
}

class Deadlock extends Thread
{
    A a = new A();
    B b = new B();

    public void m1()
    {
        this.start();
        a.d1(b);
    }
    public void run()
    {
        
        b.d2(a);
    }
    public static void main(String args[])
    {
        System.out.println("Main Class .. !!");
        Deadlock d = new Deadlock();
        d.m1();
       
    }
}