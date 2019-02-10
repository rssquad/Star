@FunctionalInterface
interface A
{
    public void m1();

}

@FunctionalInterface
interface B extends A
{
    public void m1();
    
    // public void m2();     // Invalid if we write more than one abstract method in functional interface  
}


interface C extends A
{
    public void m1();
    
    public void m2();   
} // this is normal interface so we can write any number of absctract method despite we extend functioan interface


class Functional
{
    public static void main(String[] args)
    {
        // Demo d = new Demo(); 
        // A d = new Demo();
        A d = () -> System.out.println("THIS IS LAMBDA IMPLIMENTATION IN FUNCTIONAL INTERFACE");

        d.m1();
    }
}

class Demo implements A
{
        public void m1()
        {
            System.out.println("YES I AM CALLED BY   INTERFACE REFERENCE...");
        }
}