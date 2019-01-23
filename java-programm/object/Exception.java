class Exception
{
	public static void main(String[] args)
	{
		Exception e = new  Exception();
		e.checkException();
	}

	public void checkException()
	{
		try{

			String str	= null;
			int a = str.length();
			System.out.println("length is : " + a);
		}catch(NullPointerException ne){
			System.out.println("IT's NullPointer Exception :");
		}catch(RuntimeException ne){
			System.out.println("IT's NullPointer Exception :");
		}
	}
}