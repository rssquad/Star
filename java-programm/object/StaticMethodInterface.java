interface Interf
{
    public static void m1()
    {
        System.out.println("This is stattic method od interface");
    }
}

class StaticMethodInterface
{
    public static void main(String[] args)
{
    Interf.m1(); // This is only way to call interface static method
}
}