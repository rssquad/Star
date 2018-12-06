public class Stack
{
	private int top;
	private int[] stackArray;
	private int size;
	
	stackArray(int top, int[] array, int size){
	
	this.top = top;
	this.stackArray = new array[size]; 
	
	}
	
	public void push(int element)
	{
		if(isFull)
		{
			System.out.println("Stack is full");
		}
		else
		{
			this.top++;
			this.stackArray[this.top] = element;			
		}
	}
	
	public int pop(){
	int element;
	if(isEmpty)
	{
		System.out.println("System is empty");
	}else{
		element = stackArray[]
	}
	
	}
	
	public boolean isFull(){
	boolean check = false;
		if(stackArray.length() == size)
		{
			check = true;
		}
		
		return check;
	}
	
	public boolean isEmpty(){
	boolean check = false;
	if(stackArray.length() == -1)
	{
		check = true;
	}
	
	return check;
	}
	
}