package threadexample;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Intial thread: " + Thread.currentThread().getName());
		
		MyThread thread = new MyThread("User defined Thread");
		
		thread.start();
		//puts the user defined thread on execution queue of cpu

	}

}
