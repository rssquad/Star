// Stack implimentation in java

package test.test2;

public class Stack {

	private int size;
	private int stackArray[];
	private int top;

	public Stack(int size) {

		this.size = size;
		this.stackArray = new int[size];
		top = -1;

	}

	public void push(int element) throws Exception {
		if (this.isStackFull()) {
			throw new Exception("Stack is full");
		} else {
			this.stackArray[++top] = element;
		}
	}

	public int pop() throws Exception {

		if (this.isStackEmpty()) {
			throw new Exception("Stack i sempty");
		}
		int element = this.stackArray[top--];

		System.out.println("Removed Element.." + element);
		return element;
	}

	public int peek() {

		return stackArray[top];
	}

	public boolean isStackFull() {
		return (top == size - 1);
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack stack = new Stack(5);

		stack.push(3);
		stack.push(90);
		stack.push(45);
		stack.push(67);
		stack.push(67);
		// stack.push(78);
		// stack.push(56);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

	}

}
