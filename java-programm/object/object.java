class A 
{
	public String m1()
	{
		return "This is inside A ::";
	}
}

public class object extends A
{
	public String m1()
	{
		return "This is inside B ::";
		
	}
	public static void main(String[] args)
	{
		
	//	object a = new A(); // you can't do this
	//	A a = new object(); // This object call 'object' class m1 method so o/p is "This is inside B ::"
		System.out.println(a.m1());
	}
}