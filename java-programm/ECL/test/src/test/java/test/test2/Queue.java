package test.test2;

public class Queue {

	private int capacity;
	int queueArray[];
	int currentSize;
	int rear = -1;
	int front = 0;

	public Queue(int size) {

		this.capacity = size;
		this.queueArray = new int[this.capacity];

	}

	public void enqueue(int item) {

		if (isQueueFull()) {
			// increase capacity

			System.out.println("Queue is full");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArray[rear] = item;
			currentSize++;

			System.out.println("Element added in queue is :" + item);
		}

	}

	public int dequeue() {
		int element = 0;
		if (isQueueEmpty()) {
			System.out.println("Queue is empty");
		} else {
			front++;
			if (front == capacity - 1) {
				front = 0;
			} else {

				element = queueArray[this.front];
				System.out.println("Remove element from queue is..!!" + element);
			}
		}

		return element;
	}

	public boolean isQueueFull() {

		boolean status = false;
		if (currentSize == capacity) {
			status = true;
		}

		return status;
	}

	public boolean isQueueEmpty() {
		boolean status = false;
		if (currentSize == 0) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue(10);
		queue.enqueue(5);
		queue.enqueue(86);
		queue.enqueue(98);
		queue.enqueue(45);
		queue.enqueue(89);
		queue.dequeue();
		queue.dequeue();

	}

}
