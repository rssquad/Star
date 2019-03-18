import java.io.*; 
import java.util.function.*; 
class TEst
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        System.out.println("str : " + d.str);
    }
    
}
class Demo
{
    final String str = "testing";

    
}

@FunctionalInterface
interface A
{
   public void  m1();
}

@FunctionalInterface
interface B
{
    public void m1();
}