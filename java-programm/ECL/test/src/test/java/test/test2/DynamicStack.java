package test.test2;

public class DynamicStack {

	private int stackSize;
	private int stackArray[];
	private int top;

	public DynamicStack(int size) {
		this.stackSize = size;
		this.stackArray = new int[stackSize];
		this.top = -1;
	}

	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public void push(int element) {
		if (this.isStackFull()) {
			this.increaseStackCapacity();
		}

		this.stackArray[++top] = element;
	}

	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is Empty");
		}

		int element = stackArray[top--];
		
		System.out.println("removed element.." + element);
		return element;
	}

	public void increaseStackCapacity() {
		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArray[i];
		}
		this.stackArray = newStack;
		this.stackSize = this.stackSize * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicStack dstack = new DynamicStack(2);
		 for(int i=1;i<10;i++){
			 dstack.push(i);
	        }
	        for(int i=1;i<4;i++){
	            try {
	            	dstack.pop();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	}

}
