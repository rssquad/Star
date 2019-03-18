import java.lang.*;
class ThreadDcl
{
    public static void main(String[] args)
    {
       System.out.println("CURRENT THREAD NAME" + Thread.currentThread().setName("RADHIKA"));
        System.out.println("CURRENT THREAD NAME" + Thread.currentThread());
    }
}