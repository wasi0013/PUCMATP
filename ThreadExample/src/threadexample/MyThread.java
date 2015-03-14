package threadexample;

public class MyThread extends Thread{
	
	public MyThread(String str){
		//calls constructor of the super class Thread 
		//gives a name str to the created thread
		super(str);
		
		//to start the thread from constructor 
		//this.start();
		
	}
	@Override
	public void run() {
		System.out.println("Current thread: "+Thread.currentThread().getName());
		
		//gets executed by cpu when thread is ready
		try{
			Thread.sleep(3000);
		}
		catch(Exception e){
				
		}
		
		//this will be printed after 3sec
		System.out.println("After sleep mode...");
	}

}
