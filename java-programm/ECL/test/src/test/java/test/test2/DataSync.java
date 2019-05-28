package test.test2;

public class DataSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSync dataSync = new DataSync();
		
		System.out.println("Increments...!!");
		dataSync.increment();
		System.out.println("Decrements...!!");
		dataSync.decrement();
		System.out.println("Values..");
		System.out.println(dataSync.value());
		}
	
	 private int c = 0;

	    public synchronized void increment() {
	        c++;
	        System.out.println(c);
	    }

	    public synchronized void decrement() {
	        c--;
	        System.out.println(c);
	    }

	    public synchronized int value() {
	        return c;
	    }

}
